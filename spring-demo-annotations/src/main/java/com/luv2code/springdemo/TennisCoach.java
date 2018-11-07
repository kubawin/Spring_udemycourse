package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements ICoach{

	@Autowired
	private IFortuneService fortuneService;

	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

//	@Autowired
//	public TennisCoach(IFortuneService fortuneService) {
//		System.out.println("Inside TennisCoach constructor");
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("Inside TennisCoach constructor");
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();

	}

//	@Autowired
//	public void setFortuneService(IFortuneService fortuneService) {
//		System.out.println("Inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}






}
