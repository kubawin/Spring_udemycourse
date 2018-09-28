package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout() + "\n" + theCoach.getDailyFortune());

		// close the context

		context.close();
	}

}
