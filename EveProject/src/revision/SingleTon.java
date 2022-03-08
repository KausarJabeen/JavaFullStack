package revision;
//SingleTon concept  Factory method
/*
public class SingleTon {
	public static void main(String[] args) {
		MySingleTon ob=MySingleTon.createInstance();
		
		MySingleTon obj2=MySingleTon.createInstance();
	}
}

class MySingleTon{
	private MySingleTon() {
		// TODO Auto-generated constructor stub
		System.out.println("mysingleton cons called");
	}
	private static MySingleTon obj;
	public static MySingleTon createInstance() {
		if(obj==null)
		{
			obj= new MySingleTon();
		}
		return obj;
	} */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTon {
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {			
			@Override
			public void run() {
				MySingleTon obj2=MySingleTon.createInstance();
			}
		});
		
		es.execute(new Runnable() {			
			@Override
			public void run() {
				MySingleTon obj2=MySingleTon.createInstance();
			}
		});
	
		es.shutdown();
	}
}
class MySingleTon{
	private MySingleTon() {
		System.out.println("mysingleton cons called....");
	}
	
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
			try {Thread.sleep(100);}catch(Exception e) {}
			obj=new MySingleTon();
		}
		return obj;
	}
}

