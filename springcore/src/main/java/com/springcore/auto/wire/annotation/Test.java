package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/annotationconfig.xml");
	Empl emp1= context.getBean("emp1",Empl.class);
	
	System.out.println(emp1);

	}

}
