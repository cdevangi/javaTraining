package com.data;

public class Consumer implements Runnable {

	private Message msg;
	
	public Consumer(Message msg) {
		super();
		this.msg = msg;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		
		synchronized (msg) {
			
			System.out.println(name + " waiting to get notified at "+ System.currentTimeMillis());
			try {
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " got notified at "+ System.currentTimeMillis());
			System.out.println(name + " consumed msg : "+msg.getMsg());
			
		}
	}

}
