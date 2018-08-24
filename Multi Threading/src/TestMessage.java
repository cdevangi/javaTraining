import com.data.Consumer;
import com.data.Message;
import com.data.Supplier;

public class TestMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message msg = new Message("process it!");
		Consumer waiter = new Consumer(msg);
		new Thread(waiter, "consumer 1").start();
		
		Supplier waiter1 = new Supplier(msg);
		new Thread(waiter1, "supplier 1").start();
		
		System.out.println("All thread started");

	}

}
