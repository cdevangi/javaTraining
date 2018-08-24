package com.pojo;

public class Employee extends Person {
	
	private int empID;
	private double empSalary;
	
	public Employee()
	{
		empID=0;
		empSalary=1000d;
	}

	public Employee(int age, String name,int empID, double empSalary)
	{
		super(age, name);
		this.empID=empID;
		this.empSalary=empSalary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public void display(int x)
	{
		super.display();
		System.out.println("ID: "+empID+", Sal: "+empSalary);
	}

	@Override
	public String toString() {
		return super.toString() +"Employee [empID=" + empID + ", empSalary=" + empSalary + "]";
	}
	
	
}
