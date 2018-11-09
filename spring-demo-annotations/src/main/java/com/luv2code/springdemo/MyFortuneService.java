package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements IFortuneService {


	@Value("${bubi.fortune1}")
	private String tag1;

	@Value("${bubi.fortune2}")
	private String tag2;

	@Value("${bubi.fortune3}")
	private String tag3;

	private List<String> arrFortune = new ArrayList<String>();

	private Random rdn = new Random();

	public String getFortune() {
		arrFortune.addAll(Arrays.asList(tag1, tag2, tag3));
		return arrFortune.get(rdn.nextInt(arrFortune.size()));
	}

}
