package com.rperezv365.springsecsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ij, Spring Framework Guru.
 *
 * @author architecture - rperezv
 * @version 13/03/2025 - 15:52
 * @since jdk 1.21
 */
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with security";
    }

}
