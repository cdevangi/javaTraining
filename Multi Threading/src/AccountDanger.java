
public class AccountDanger implements Runnable {

	private Account act = new Account();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int x=0; x<5;x++) {
			makeWithdrawal(10);
			
			if(act.getBalance() < 10)
				System.out.println("Account is overdrawn!!");
		}

	}
	
	synchronized private void makeWithdrawal(int amt) {
		
		if(act.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			act.withDraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes withdrawal");
		}
		
		else
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw "+act.getBalance());
		
	}
	
	public static void main(String[] args) {
		
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		
		one.setName("Fred");
		two.setName("Lucy");
		
		one.start();
		two.start();
		
		
	}

}
