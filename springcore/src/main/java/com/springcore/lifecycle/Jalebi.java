package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Jalebi [subject = "+subject+ "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
	

}
