package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retreive bean from spring container

		ICoach theCoach = context.getBean("tennisCoach",ICoach.class);
		ICoach alphaCoach = context.getBean("tennisCoach",ICoach.class);

		//check the reference equality
		boolean result = (theCoach == alphaCoach);

		System.out.println("Pointing to the same location: " + result);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);

		context.close();

	}

}
