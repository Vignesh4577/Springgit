package com.training.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        
		//create the IOC container
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.training.setter");
		
//		Employee employee = (Employee) applicationContext.getBean("employee");
//        System.out.println(employee);
        
        Employee employee2 = applicationContext.getBean(Employee.class,"employee");
        System.out.println(employee2);
        
//        Employee employee3 = applicationContext.getBean(Employee.class);
//        System.out.println(employee3);
//        System.out.println("---------------------------------------------------");
//        
        Address address = applicationContext.getBean(Address.class);
//        System.out.println(address);
        System.out.println(employee2);
        
//        String[] beans = applicationContext.getBeanDefinitionNames();
//        for(String bean:beans) {
//        	System.out.println(bean);
//        }
//        System.out.println("Another way");
//        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
