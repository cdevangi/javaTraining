package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myfile = new File("abc.txt");

		
		try {
			myfile.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
