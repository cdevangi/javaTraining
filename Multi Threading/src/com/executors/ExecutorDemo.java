package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<2;i++) {
			//System.out.println("in main for loop");
			exec.execute(new myapp());
		}
		
		System.out.println("After submitting tasks");
		
		System.out.println("After for loop");
		exec.execute(new myapp());
		
		exec.shutdown();
		System.out.println("Donee");
	}

}
