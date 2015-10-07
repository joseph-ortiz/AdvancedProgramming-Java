package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProblem  {

	static Integer number = 1000;
	
	public static void main(String[] args) {
		Runnable task1 = new Runnable(){
			@Override
		    public void run(){
		    	synchronized(number){
					number+=1;
			    	System.out.println("task1: " + number.toString());
		    	}
		    }
		};
		Runnable task2 = new Runnable(){
			 
		    @Override
		    public void run(){
		    	synchronized(number){
		    		number-=1;
			    	System.out.println("taks 2:  								" + number.toString());
			  
		    	}
		    }
		};
		//ExecutorService executor = Executors.newFixedThreadPool(2);
		
		while(true){
			try{
			//executor.execute(task1);
			//executor.execute(task2);
				Thread t1 = new Thread(task1);
				Thread t2 = new Thread(task2);
				t1.sta
			}catch(Exception e){
				System.out.println("errorwith task :" + e.getMessage());
			}	
		}	
	}	
}
