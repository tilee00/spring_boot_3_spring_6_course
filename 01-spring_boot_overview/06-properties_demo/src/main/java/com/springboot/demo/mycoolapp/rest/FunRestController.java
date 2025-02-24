package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @Value("${currentUser.name}")
    private String userName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + userName + "; Team name: " + teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")    // tells Spring Boot what URL this method should respond to (example: http://localhost:8080/)
    public String sayHello(){
        return "Hello World!";
    }

    // expose a new endpoint for "workout" 
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }


}
