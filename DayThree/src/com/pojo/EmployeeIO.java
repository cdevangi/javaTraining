package com.pojo;

public interface EmployeeIO {
	
	double PI = 3.14;
	public static final String name="CITY";
	
	Employee readEmployee();
	public abstract void writeEmployee(Employee e); 

}
