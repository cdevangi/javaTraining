package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("xyz.txt",true); //true means append
			fw.write("Citi, Pune");
			System.out.println("File writing successful");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
