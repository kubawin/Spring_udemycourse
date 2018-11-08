package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements IFortuneService {

	private String[] data = { "Pierwszy", "Drugi", "Trzeci"};
	private Random rdn = new Random();

	public String getFortune() {
		// pick a random string from the array

		int index = rdn.nextInt(data.length);
		return data[index];

	}

}
