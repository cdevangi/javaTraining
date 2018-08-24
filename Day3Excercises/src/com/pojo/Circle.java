package com.pojo;

public class Circle extends Shape {
	
	private int r;
	
	public Circle()
	{
		r=0;
	}
	
	public Circle(int r,String name) {
		super(name);
		this.r = r;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
	
		return 3.14*r*r;
	}

}
