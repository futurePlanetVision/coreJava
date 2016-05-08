package countlatches;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// thread
class Processor implements Runnable{

	public CountDownLatch latch;
	public Processor(CountDownLatch latch){
		this.latch=latch;
	}
	@Override
	public void run() { // here is the code you want to run inside thread
	System.out.println("started");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	latch.countDown();
	}

	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownLatch latch= new CountDownLatch(3);
			ExecutorService executor=Executors.newFixedThreadPool(3);
			for (int i=0; i<3; i++){
				executor.submit(new Processor(latch));
			}
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Completed!");
	}
	

}
