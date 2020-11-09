package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    CheckerService checkerService;

    @GetMapping("/test")
    String test() {
        return checkerService.check() ? "OK" : "NOT OK";
    }

}
