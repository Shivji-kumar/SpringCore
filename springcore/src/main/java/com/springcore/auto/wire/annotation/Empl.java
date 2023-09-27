package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Empl {
	@Autowired
    @Qualifier("temp")
	private Address address;

	public Address getAddress() {
		return address;
	}

//2	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

//3	@Autowired
	public Empl(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Empl [address=" + address + "]";
	}
	
	
	

}
