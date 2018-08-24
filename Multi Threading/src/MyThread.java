
public class MyThread extends Thread {
	
	private int data;
	
	public MyThread() {
		data=-1;
	}
	
	public MyThread(int data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Thread "+Thread.currentThread().getName()+" started ");
		System.out.println("Thread "+Thread.currentThread().getName()+" with data value as "+data);
		System.out.println("Thread "+Thread.currentThread().getName()+ " ended ");
	}

}
