package mod1.day17;

import java.util.Scanner;

public class ExceptionDemo3a {
	public static void main(String[] args) {
		Child sarah=new Child();
		BullDog dog=new BullDog();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a item to play with dog");
		String item=scan.next();
		sarah.playWithBullDog(dog, item);
		
	}

}
class Child{
	public void playWithBullDog(BullDog dog,String item) {
		try {
				dog.play(item);
		}catch(DogBiteException de) {
			System.out.println(de);
			System.out.println("Please take him to hospital...");
		}catch(DogBarkException dre) {
			System.out.println(dre);
			System.out.println("Barking dogs seldom bite ...no worries.");
		}catch(DogException dee) {
			System.out.println(dee);
			System.out.println("Unknown exception we wil study and handle it");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Parent class exception");
		}finally {
			System.out.println("Thank you Dog");
		}
	}
}
class BullDog {
	public void play(String item) throws Exception {
		if(item.equals("stick")) {
			throw new DogBiteException("You beat i Bite");
		}else if (item.equals("stone")) {
			throw new DogBarkException();
		}
	}
	
}
abstract class DogException extends Exception {
	
}

class DogBiteException extends DogException{
	String msg;
	public DogBiteException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception is...."+this.msg;
	}
	
}
class DogBarkException extends DogException {
	
}