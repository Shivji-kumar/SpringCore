package com.springcore.springel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springel/exconfig.xml");
		
		Expresstion exp=context.getBean("expresstion", Expresstion.class);
		System.out.println(exp);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression= temp.parseExpression("12+16");
		System.out.println(expression.getValue());
		
	}

}
