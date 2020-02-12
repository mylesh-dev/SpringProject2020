package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		context.close();
	}

}
