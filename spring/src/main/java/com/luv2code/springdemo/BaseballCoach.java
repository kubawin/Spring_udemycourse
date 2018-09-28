package com.luv2code.springdemo;

public class BaseballCoach implements ICoach {
	
	private IFortuneService fortuneService; 
	
	public BaseballCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice!";			
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
