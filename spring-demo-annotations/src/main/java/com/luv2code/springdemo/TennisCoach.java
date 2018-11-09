package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("singleton")
public class TennisCoach implements ICoach{

//Autowiring field
	@Autowired
	@Qualifier("randomService")
	private IFortuneService fortuneService;

//Autowired constructor
//	@Autowired
//	public TennisCoach(@Qualifier("randomService")IFortuneService fortuneService) {
//		System.out.println("Inside TennisCoach constructor");
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("Inside TennisCoach default constructor");
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside my doMyStartupStuff method");
	}

	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside my doMyCleanupStuff method");
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

// Autowired setter(any method)
//	@Autowired
//	public void setFortuneService(IFortuneService fortuneService) {
//		System.out.println("Inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}






}
