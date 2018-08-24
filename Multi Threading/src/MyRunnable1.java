
public class MyRunnable1 implements Runnable {

	
	private Thread t;
	
	public MyRunnable1() {
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Current : "+ Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new MyRunnable1();
	}

}
