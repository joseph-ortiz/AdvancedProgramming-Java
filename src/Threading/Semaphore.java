package Threading;
class SemaphoreTest {
	
	public static void main(String[] args){
		SemaphoreTest s = new SemaphoreTest();
		s.deposit(19);
	}
	
	//Create a semaphore
	private static java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(1);
	private int balance = 0;
	
	public int getBalance(){
		return balance;
	}
	
	public void deposit(int amount){
		try{
			semaphore.acquire();
			int newBalance = balance + amount;
			Thread.sleep(5);
			balance = newBalance;
		}
		catch(InterruptedException ex){}
		finally{
			semaphore.release();
		}
	}

}
