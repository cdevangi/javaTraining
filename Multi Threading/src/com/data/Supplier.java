package com.data;

public class Supplier implements Runnable {

	private Message msg;
	
	public Supplier(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " started");
		
		try {
			Thread.sleep(1000);
			
			synchronized (msg) {
				msg.setMsg("Hello from thread");
				msg.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
