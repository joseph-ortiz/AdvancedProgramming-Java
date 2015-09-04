package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProblem  {

	static Integer number = 1000;
	
	public static void main(String[] args) {
		Runnable task1 = new Runnable(){
			@Override
		    public void run(){
		    	number+=1;
		    	System.out.println(number.toString());
		    }
		};
		Runnable task2 = new Runnable(){
			 
		    @Override
		    public void run(){
		    	number-=1;
		    	System.out.println(number.toString());
		    }
		};
		ExecutorService executor = Executors.newFixedThreadPool(2);
		while(true){
			try{
			executor.execute(task1);
			executor.execute(task2);
			}catch(Exception e){
				System.out.println("errorwith task :" + e.getMessage());
			}	
		}	
	}	
}
