package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"
    @GetMapping("/")    // tells Spring Boot what URL this method should respond to (example: http://localhost:8080/)
    public String sayHello(){
        return "Hello World!";
    }
}
