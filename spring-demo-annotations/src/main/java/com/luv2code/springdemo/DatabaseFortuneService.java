package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {

	public String getFortune() {
		return "DatabaseFortune";
	}

}
