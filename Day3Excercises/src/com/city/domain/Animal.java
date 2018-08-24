package com.city.domain;

public abstract class Animal {

	private int age;
	
	public Animal()
	{
		age=0;
	}
	
	public Animal(int age) {
		super();
		this.age = age;
	}
	
	public abstract void sound();
	
	
}
