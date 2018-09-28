package com.luv2code.springdemo;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService; 
	
	public TrackCoach() {}
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
	
		return "Run for 30 inutes";
	}

	public String getDailyFortune() {
		return "Just do it!";
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff()");
	}
	
	//add a destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside doMyDestroyStuff()");
	}
	
	
	
}
