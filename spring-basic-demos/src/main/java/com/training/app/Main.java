package com.training.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {


		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.training.app");
		
		DbConnection connection = applicationContext.getBean(DbConnection.class);
		System.out.println(connection);

	}

}
