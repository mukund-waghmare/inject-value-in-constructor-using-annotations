package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("conf.xml");
		
		Person per=(Person)context.getBean("person");
		
		System.out.println(per.age);
	}
}
