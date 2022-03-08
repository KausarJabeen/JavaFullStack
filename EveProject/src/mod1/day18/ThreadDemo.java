package mod1.day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
//		Thread t=Thread.currentThread();
		
		System.out.println("First line Started 1.");
		es.execute(new FirstThreadJob());
		System.out.println("First line ends 1 ends.");
		es.execute(new SecondThreadJob());

		es.shutdown();
		
	}
}
class FirstThreadJob implements Runnable {
	@Override
	public void run() {
		System.out.println("second line started 2 starts.");
		try{ Thread.sleep(10000); }catch(Exception e) {}
		System.out.println("Second line ends 2 ends.");
	}
}
class SecondThreadJob implements Runnable {
	@Override
	public void run() {
		System.out.println("Third Line Stated 3 starts");
		try { Thread.sleep(2000); }catch(Exception e) {}
		System.out.println("Third line ends 3 Ends.");
		
	}
	
}