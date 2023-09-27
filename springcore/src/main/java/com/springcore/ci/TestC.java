package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC {

	public static void main(String[] args) {
		System.out.println("Test Constructor..");
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	
	Person p=(Person) context.getBean("person");
	System.out.println(p);
	
	Addition add=(Addition) context.getBean("add");
	add.doSum();

	}
  
}
