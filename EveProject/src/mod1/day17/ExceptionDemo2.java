package mod1.day17;
//throw and throws
/*
* throw - is for explicitly throwing an exception
* throws - does two things 1. Can convey to the user of the method that this method is capable of throwing an exception
* 2. It skips the compilation check for checked exception
*/
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		LBoard lBoard=new LBoard();
		try {
			dog.play("fkdjafljds");
			lBoard.driving("aaa");
			
		}catch(Exception e) {
		}
		
		
	}
	public void met(){
		try {
			wait(); // handled exception
		}catch(Exception e) {}
		
//		wait(); // unhandled exception this will not handle outside try catch handle. but for it to be handled we shud use throws Exception  for the method
	}
}
class Dog{
	public void play(String item)throws Exception { 
		if(item.equals("stick")) {
			
				throw new Exception(); // will throw an exception based on condition created by us
										// throws convey to the caller of the method that this method is
										//capable of throwing an exception
		}
	}
}
class LBoard{
	public void driving(String road)throws Exception {
		if(road.equals("slope")) {
			throw new Exception();
		}
	}
}