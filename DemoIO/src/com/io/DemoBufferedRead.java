package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBufferedRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter something: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("you entered: "+br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
