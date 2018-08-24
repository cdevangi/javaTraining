
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Thread "+Thread.currentThread().getName()+" started.");
		
		Thread t = new MyThread();
		t.setName("First Thread");
		t.start();
		
		Thread t1 = new MyThread(43);
		t1.setName("Second Thread");
		t1.start();
		
		Thread t2 = new MyThread(20);
		t2.start();
		
		System.out.println("Thread "+Thread.currentThread().getName()+" ended.");
	}

}
