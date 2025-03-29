package com.springboot.demo;

import org.springframework.stereotype.Component;

// component mark the class as spring bean make it available for dependency injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice fact bowling for 15 minutes !!!";
    }
}
