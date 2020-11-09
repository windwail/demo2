package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CheckerService {

    public boolean check() {
        return new Random().nextBoolean();
    }

}
