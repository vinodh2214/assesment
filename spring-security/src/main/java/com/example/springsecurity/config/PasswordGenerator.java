package com.example.springsecurity.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String originalPassword="vinodh";
        String encodedPassword= encoder.encode(originalPassword);
        System.out.println(encodedPassword);
    }
}
