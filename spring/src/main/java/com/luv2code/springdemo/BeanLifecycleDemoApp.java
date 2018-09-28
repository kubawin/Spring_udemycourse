package com.luv2code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve bean from spring container
		
		ICoach singletonCoach = context.getBean("mySingletonCoach", ICoach.class);
		System.out.println("Memoty location of SingletonCoach: " + singletonCoach + "\n");

//		ICoach prototypeCoach = context.getBean("myPrototypeCoach", ICoach.class);
//		System.out.println("Memoty location of PrototypeCoach: " + prototypeCoach + "\n");
//		
		//close
		
		context.close();
	}

}
