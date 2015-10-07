package InClassRunnable;

/**
This program runs threads that deposit and withdraw
money from the same bank account. 
*/
public class BankAccountThreadRunner
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount(5000);
	  
	      PaymentRunnable d = new PaymentRunnable(
	         account);
	      WithdrawRunnable w = new WithdrawRunnable(
	         account);
	      
	      Thread dt = new Thread(d);
	      Thread wt = new Thread(w);
	      
	      dt.start();
	      wt.start();
	   
	}
}
