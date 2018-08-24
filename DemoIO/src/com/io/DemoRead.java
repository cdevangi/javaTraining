package com.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number: ");
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			System.out.println("you entered: "+rd.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
