package com.example.securitydemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.assertj.core.api.Assertions.*;

public class bcryptPasswordEncoderTest {

    @Test
    void passwordEncoder_확인하기() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password1 = bCryptPasswordEncoder.encode("1234");
        String password2 = bCryptPasswordEncoder.encode("1234");

        System.out.println(password1);

        assertThat(password1).isNotEqualTo(password2);
        assertThat(true).isEqualTo(bCryptPasswordEncoder.matches("1234", password1));
        assertThat(true).isEqualTo(bCryptPasswordEncoder.matches("1234", password2));

    }
}
