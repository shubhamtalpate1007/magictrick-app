package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.TrickService;

@RestController
@RequestMapping("/api/trick")
public class TrickController {

    @GetMapping("/guess/{finalNumber}")
    public int guessNumber(@PathVariable int finalNumber) {
        return finalNumber - 3;
    }
}
