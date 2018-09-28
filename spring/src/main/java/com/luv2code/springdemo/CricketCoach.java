package com.luv2code.springdemo;

public class CricketCoach implements ICoach{

	private IFortuneService fortuneService;
	
	private String emailAdress;
	private String team;

	public CricketCoach() {
		System.out.println("Inside no arg constructor of CricketCoach");
	}
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("Inside setter email adress method of CricketCoach");
		this.emailAdress = emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter team method of CricketCoach");
		this.team = team;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Inside setter fortune service method of CricketCoach");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Paddle paddle paddle";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
