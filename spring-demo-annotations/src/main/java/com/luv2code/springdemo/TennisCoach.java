package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements ICoach{

//	@Autowired
//	@Qualifier("randomService")
	private IFortuneService fortuneService;

	@Autowired
	public TennisCoach(@Qualifier("randomService")IFortuneService fortuneService) {
		System.out.println("Inside TennisCoach constructor");
		this.fortuneService = fortuneService;
	}

	public TennisCoach() {
		System.out.println("Inside TennisCoach constructor");
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
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
