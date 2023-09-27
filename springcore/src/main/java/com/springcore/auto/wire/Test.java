package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
	Empl emp1= context.getBean("emp1",Empl.class);
	
	System.out.println(emp1);

	}

}
