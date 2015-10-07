package InClassRunnable;

public class PaymentRunnable implements Runnable {
	private BankAccount account;
	
	public PaymentRunnable(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++)
		{
			account.deposit(1.00);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("after deposit" + account.getBalance());
		}
	}

}
