
public class DemoWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoNotify dn = new DemoNotify();
		dn.start();
		
		synchronized (dn) {
			try {
				dn.wait();
				System.out.println("sum: "+ dn.sum);  //dn is worker thread and the main thread is the processor thread

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
