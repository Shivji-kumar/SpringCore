package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class STest {
	public static void main (String [] args) {
		
		System.out.println("Samosa Application");
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/sconfig.xml");
		//registring shutdown hook
		context.registerShutdownHook();
		
		Samosa s1=(Samosa) context.getBean("s1");
		
		System.out.println("-------------------");
		System.out.println(s1);	
		
		System.out.println("------------------");
		
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		System.out.println("--------------------");
		
		Jalebi j1=(Jalebi) context.getBean("j1");
		System.out.println(j1);
		System.out.println("--------------------");
		
		
	}

}
