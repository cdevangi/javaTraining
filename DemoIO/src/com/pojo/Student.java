package com.pojo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;

import com.myinterfaces.StudentFileIO;
import com.myinterfaces.StudentIO;

public class Student implements Serializable{

	private int rollNo, total;
	String name;
	
	public Student() {
		rollNo=total=0;
		name=null;
	}

	public Student(int rollNo, int total, String name) {
		super();
		this.rollNo = rollNo;
		this.total = total;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", total=" + total + ", name=" + name + "]";
	}

	
}
