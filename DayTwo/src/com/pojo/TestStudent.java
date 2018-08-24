package com.pojo;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
		
	Scanner in = new Scanner(System.in);
		System.out.println("Enter name: ");
		s.setName(in.nextLine());
		System.out.println("Enter roll no: ");
		s.setRollNo(in.nextInt());
		System.out.println("Enter marks of 3 subjects: ");
		int [] temp = new int [3];
		for(int x=0;x<temp.length;x++)
			temp[x]=in.nextInt();
		s.setMarks(temp);
		
		s.display();

	}

}
