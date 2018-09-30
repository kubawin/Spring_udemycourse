package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		ICoach theCoach = context.getBean("thatSillyCoach",ICoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//close the context
		context.close();
	}

}
