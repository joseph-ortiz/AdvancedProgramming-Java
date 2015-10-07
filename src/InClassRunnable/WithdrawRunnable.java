package InClassRunnable;

public class WithdrawRunnable implements Runnable {
	private BankAccount account;
	
	public WithdrawRunnable(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++)
		{
			account.withdraw(1.00);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("\t\t  after withdrawal" + account.getBalance());
		}
	}

}
