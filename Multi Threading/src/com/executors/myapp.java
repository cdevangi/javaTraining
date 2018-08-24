package com.executors;

public class myapp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		perform();

	}
	
	void perform() {
		for(int i=0;i<5;i++) {
			//System.out.println("in myapp for loop");
			System.out.println("Hello "+i+" "+Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
