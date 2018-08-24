package com.pojo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myinterfaces.StudentFileIO;
import com.myinterfaces.StudentIO;

public class Logic implements StudentFileIO, StudentIO{

	@Override
	public Student[] readFromUser() {
		// TODO Auto-generated method stub
		
		int roll=0,marks=0;
		String name=null;
		Student [] s = new Student[5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=0;
	    while(cnt!=s.length) {
	    	System.out.println("Enter rollno: ");
			try {
				roll = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter marks: ");
			try {
				marks = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter name: ");
			try {
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			s[cnt]  = new Student(roll,marks,name);
			cnt++;
	    	
	    }
		return s;
	}

	@Override
	public void writeToUser(Student[] student) {
		// TODO Auto-generated method stub
			for(int i=0;i<student.length;i++)
			     System.out.println(student[i]);
			
		

	}

	@Override
	public Student[] readStudents() {
		// TODO Auto-generated method stub
		
		FileInputStream fi=null;
		try {
			fi = new FileInputStream("student.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream oi=null;
		try {
			oi = new ObjectInputStream(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student[] student = null;
		try {
			student = (Student []) oi.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return student;
	}

	@Override
	public int writeStudents(Student[] student) {
		// TODO Auto-generated method stub

try {
		FileOutputStream fo = new FileOutputStream("student.txt");
		ObjectOutputStream oo = new  ObjectOutputStream(fo);
		oo.writeObject(student);
		
		oo.close();
		fo.close();
}catch(IOException e) {
	e.printStackTrace();
}
		return 0;
	}

}
