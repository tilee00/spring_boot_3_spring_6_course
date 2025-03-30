package com.springboot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    //constructor for dependency injection
    // autowired tells spring to inject a dependency
    @Autowired
    public DemoController (Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
