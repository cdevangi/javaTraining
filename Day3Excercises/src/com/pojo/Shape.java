package com.pojo;

public abstract class Shape {
	
	private String name;
	
	public void description() {
		System.out.println("name: "+name);
	}
	
	public Shape() {
		name="no name";
	}
	
	public Shape(String name) {
		super();
		this.name = name;
	}



	public abstract double area() ;
	
	

}
