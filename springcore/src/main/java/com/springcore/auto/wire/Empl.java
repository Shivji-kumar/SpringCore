package com.springcore.auto.wire;

public class Empl {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

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
