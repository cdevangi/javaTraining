
public class DemoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Thread "+Thread.currentThread().getName()+" started.");
		
		Thread t1 = new MyThread();
		t1.setName("HIGH");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		System.out.println("Thread "+Thread.currentThread().getName()+" completed.");
	}

}
