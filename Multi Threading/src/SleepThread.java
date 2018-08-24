
public class SleepThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			System.out.println("i: "+ i);
		    try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t = new SleepThread();
		t.start();
	}

}
