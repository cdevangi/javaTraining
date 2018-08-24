package com.pojo;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int [] marks = new int[3];
	private int rollNo;
	
	
	public Student() {
		name=null;
		rollNo=0;
		for(int x =0;x<marks.length;x++)
			marks[x]=-1;
	}
	
	public Student(String name,int [] marks, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks=Arrays.copyOf(marks,marks.length);
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(rollNo);
		for(int x:marks)
			System.out.print(x+"\t");
		
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = Arrays.copyOf(marks, marks.length);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	

}
