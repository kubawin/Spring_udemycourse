package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements IFortuneService {

	private Random rdn = new Random();;
	private String[] fortuneList = {"Fortune 1", "Fortune 2", "Fortune 3"};
	
	public String getFortune() {
		return fortuneList[rdn.nextInt(3)];
	}
	
}
