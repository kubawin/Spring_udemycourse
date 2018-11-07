package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements IFortuneService {

	public String getFortune() {
		return "Random";
	}

}
