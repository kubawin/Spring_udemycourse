package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container. Creates the object and calls the setter method.
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods to get the literal values
		System.out.println(theCricketCoach.getEmailAdress() + "\n" + theCricketCoach.getTeam());

		// call methods o the bean
		System.out.println(theCricketCoach.getDailyWorkout() + "\n" + theCricketCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
