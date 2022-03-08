package revision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadLocalDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Luggage luggage=new Luggage();
				
				CloakRoom.setLuggage(luggage);
				
				System.out.println("Thread 1....:"+CloakRoom.getLuggage());
				
				CloakRoom.setLuggage(luggage);
				
				System.out.println("Thread 1....:"+CloakRoom.getLuggage());
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Luggage luggage=new Luggage();
				
				CloakRoom.setLuggage(luggage);
				
				System.out.println("Thread2...:"+CloakRoom.getLuggage());
				
				CloakRoom.setLuggage(luggage);
				
				System.out.println("Thread2....:"+CloakRoom.getLuggage());
			}
		});
		
		es.shutdown();
	}
}
class Luggage{}
class CloakRoom{
	
	private static ThreadLocal<Luggage> tLocal=new ThreadLocal<>();
	
	public static void setLuggage(Luggage luggage) {
		tLocal.set(luggage);
	}
	public static Luggage getLuggage() {
		Luggage luggage=tLocal.get();
		if(luggage==null) {
			System.out.println("the user does not have a luggage in this cloak room....");
			return null;
		}
		else {
			tLocal.remove();
			return luggage;
		}
	}
}