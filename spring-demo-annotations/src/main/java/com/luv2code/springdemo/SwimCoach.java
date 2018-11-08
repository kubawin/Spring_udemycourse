package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thatSwimCoach")
public class SwimCoach implements ICoach {

	@Value("{foo.email}")
	private String email;

	@Value("{foo.team}")
	private String team;

	public SwimCoach(String email, String team) {
		this.email = email;
		this.team = team;
	}

	public String getDailyWorkout() {
		return email + ", " + team;
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
