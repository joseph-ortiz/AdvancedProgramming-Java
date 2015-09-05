package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class AccountsWithSyncUsingLock {
	
	private static Account account = new Account();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 100; i++)
		{
			executor.execute(new AddAPennyTask());
		}
		executor.shutdown();
		while(!executor.isTerminated()){}
		
		System.out.println("What is balance? " + account.getBalance());
	}
	
	public static class AddAPennyTask implements Runnable {
		public void run(){
			account.deposit(1);
		}
	}
	
	private static class Account {
		private static Lock lock = new ReentrantLock(); //create a lock
		private int balance = 0;
		
		public int getBalance(){
			return balance;
		}
		
		public void deposit(int amount){
			lock.lock();// Lock acquired.
			try{
				int newBalance = balance + amount;
				Thread.sleep(5); //This delay is deliberately added to magnify the data-corruption problem and make it easy to see.
				balance = newBalance;
			}catch(InterruptedException ex){}
			finally{
				lock.unlock();
			}
		}
	}

}
