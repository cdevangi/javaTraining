package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {
	
	public static void main(String [] args) {
		
		try {
			FileReader fr = new FileReader("xyz.txt");
			byte value=0;
			
			do {
				int data = fr.read();
				System.out.print((char)data);
				value=(byte)data;
				
			}while(value!=-1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
