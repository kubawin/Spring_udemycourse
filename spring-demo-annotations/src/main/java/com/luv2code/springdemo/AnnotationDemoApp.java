package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve the bean
//		ICoach theCoach = context.getBean("tennisCoach",ICoach.class);

		ICoach theCoach = context.getBean("swimCoach",ICoach.class);

		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		//call our new swim coach getter methods

		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());

		//close the context
		context.close();
	}

}
