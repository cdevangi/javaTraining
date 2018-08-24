
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running "+Thread.currentThread().getName());

	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Running "+Thread.currentThread().getName());

		Runnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		t.start();
	}

}
