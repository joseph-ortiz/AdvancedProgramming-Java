package Threading;

public class TaskThreadDemo {

	public static void main(String[] args) {
		//Create Tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);
		
		//Creates Threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		////Starts threads
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

class PrintChar implements Runnable {
	private char charToPrint; //The character to print;
	private int times; // THe number of times to repeat
	
	public PrintChar(char c, int t)
	{
		charToPrint = c;
		times = t;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < times; i++)
		{
			System.out.println(charToPrint);
		}
		
	}
}


class PrintNum implements Runnable {
	
	private int lastNum; // THe number of times to repeat
	
	public PrintNum(int n)
	{
		lastNum = n;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= lastNum; i++)
		{
			System.out.println(" " + i);
		}
	}
}
