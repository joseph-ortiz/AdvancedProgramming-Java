package Threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducerUsingBlockingQueue {
	private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2);
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
	}
	
	// A task for adding an int to the buffer
	private static class ProducerTask implements Runnable {
		public void run(){
			try{
				int i = 1;
				while(true){
					System.out.println("Producer writes " + i);
					buffer.put(i++); //add any value to the buffer, say , 1 
					//put the thread to sleep
					Thread.sleep((int) Math.random() * 10000);
				}
			}
			catch( InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
	
	private static class ConsumerTask implements Runnable {
		public void run(){
			try{
				while(true){
					System.out.println("\t\tConsumer reads " + buffer.take());
					//put the thread to sleep
					Thread.sleep((int) Math.random() * 10000);
				}
			}
			catch( InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
}
