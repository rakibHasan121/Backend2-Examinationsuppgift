package com.example.examinationsuppgift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rakib
 * Date: 2021-09-16
 * Projekt: examinationsuppgift
 */

@RestController
public class ApplicationController {

    @GetMapping("/hello")
    public String index() {
        return "Hello, World!";
    }
}
