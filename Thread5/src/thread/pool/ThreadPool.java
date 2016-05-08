package thread.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processors implements Runnable{
	private int id;
	Processors( int id){
		this.id=id;
	}

	@Override
	public void run() {
		
		System.out.println("Starting....  "+id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
			
		System.out.println("completed  "+id);
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		
		
		ExecutorService executor= Executors.newFixedThreadPool(2);
		 for (int i=1; i<6; i++){
			executor.submit(new Processors(i));
		 }
		executor.shutdown();
		System.out.println("All tasks submitted");
		try {
			executor.awaitTermination(15, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All tasks completed");
	}

}
