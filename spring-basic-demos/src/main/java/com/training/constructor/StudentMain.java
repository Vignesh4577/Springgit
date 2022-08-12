package com.training.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.training.constructor");
		
		Student student = applicationContext.getBean(Student.class,"student");
		System.out.println(student);
	}

}
