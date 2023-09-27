package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student=con.getBean("studob",Student.class);
//		System.out.println(student);
//		System.out.println("====================================");
//		
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
//	
		System.out.println("Hashcode for Student");
		System.out.println(student.hashCode());
		
		Student student2=con.getBean("studob",Student.class);
		System.out.println(student2.hashCode());
		System.out.println("=========================");
		
		System.out.println("Hashcode for Teacher");
		Teacher teacher1=con.getBean("teacher",Teacher.class);
		Teacher teacher2=con.getBean("teacher",Teacher.class);
		
		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());
		
	}

}
