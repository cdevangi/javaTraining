package com.pojo;

public class Rectangle extends Shape {

	int l,b;
	

	public Rectangle() {
		l=b=0;
	}
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return l*b;
	}

}
