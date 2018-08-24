package com.pojo;

import java.util.Scanner;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter id and salary: ");
		e.setEmpID(in.nextInt());
		e.setEmpSalary(in.nextDouble());
		return e;
	}

	@Override
	public void writeEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		System.out.println("ID: "+e.getEmpID());
		System.out.println("Salary: "+e.getEmpSalary());

	}

}
