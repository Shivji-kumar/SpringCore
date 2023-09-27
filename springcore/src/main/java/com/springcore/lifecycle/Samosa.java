package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Samos [price = "+price+"]";
	}
	
	public void jawani() {
		System.out.println("Inside init Method hey how are you");
	}
	public void deewani() {
		System.out.println("Inside destroy Method bye i am going for die");
	}

}
