package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ThreadCooperation {
	private static Account account = new Account();
	
	public static void main(String[] args) {
		//Create a thread pool with two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();
	}
	public static class DepositTask implements Runnable {

		@Override
		public void run() {
			try{//Keep adding an ammount to an account
				while(true){
					account.deposit((int) (Math.random() * 10) + 1);
					Thread.sleep(1000);
				}
			}catch(InterruptedException ex){ex.printStackTrace();}
		}
	}
	
	public static class WithdrawTask implements Runnable {

		@Override
		public void run() {
			try{//Keep subtracting an ammount to an account
				while(true){
					account.withdraw((int) (Math.random() * 10) + 1);
					Thread.sleep(1000);
				}
			}catch(InterruptedException ex){ex.printStackTrace();}
		}
	}
	
	private static class Account {
		//Create a new lock
		private static Lock lock = new ReentrantLock();
		
		//Create a condition
		private static Condition newDeposit = lock.newCondition();
		
		private int balance = 0;
		
		public int getBalance(){
			return balance;
		}
		
		public void withdraw(int amount){
			lock.lock();
			try{
				while (balance < amount){
					System.out.println("\t\t\t Wait for a deposit");
					newDeposit.await();
				}
				balance -= amount;
				System.out.println("\t\tWithdraw " + amount + "\t\t" + getBalance());
			}catch(InterruptedException ex){ 
				ex.printStackTrace();
			}
			finally{
				lock.unlock();
			}
		}
		
		public  void deposit(int amount){
			lock.lock();
			try{
				balance +=amount;
				System.out.println("Deposit: " + amount + "\t\t\t\t\t" + getBalance());
				
				//Signal thread waiting on the condition.
				newDeposit.signalAll();
			}finally{
				lock.unlock();
			}
		}
	}

}
