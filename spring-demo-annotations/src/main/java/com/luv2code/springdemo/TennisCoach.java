package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements ICoach{

	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	
}
