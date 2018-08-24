package com.city.domain;

public class Cat extends Animal {

	
	public Cat(int age)
	{
		super(age);
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("A cat meows");

	}

}
