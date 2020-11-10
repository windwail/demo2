package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CheckerService {

    @Value("${my.param}")
    private String param;

    public String check() {
        return param;
    }

}
