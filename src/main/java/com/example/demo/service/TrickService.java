package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TrickService {

    public int findOriginalNumber(int finalNumber) {
        // Trick formula: original = final - 3
        return finalNumber - 3;
    }
}
