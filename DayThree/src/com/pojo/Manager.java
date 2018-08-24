package com.pojo;

public class Manager extends Employee {
	
	String department;
	double incentive;
	
	public Manager()
	{
		department=null;
		incentive=1000;
	}
	
	public Manager(String department, double incentive,int age,String name,int empID, double empSalary)
	{
		super(age, name, empID, empSalary);
		this.department=department;
		this.incentive=incentive;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("dept: "+department+", incentive: "+incentive);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

}
