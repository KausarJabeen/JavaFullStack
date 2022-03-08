package missed.topics;
//wrapper class

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * for every primitive type, we have a corresponding wrapper class in java.
		 * 
		 * int- Integer
		 * byte - Byte
		 * long - Long
		 * char - Character
		 * boolean - Boolean
		 * 
		 * Why we need them?
		 * 1.Simple types are not objects, so when some application is expecting only object then
		 * you use the wrapper 
		 * 2. Lot of utility methods are there in wrapper classes, which may be of use.
		 * 
		 * Difference:
		 * when you use primitive, only value copy along is created in stack
		 * but when you use wrapper, it creates an extra object( which is not good)
		 * ie. the problem it creates 2 objects, one is value object and other object in heap unnecessary
		 */
		
		//utility methods
		System.out.println(Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.compare(20, 10));
		String n1=args[0];
		String n2=args[1];
		System.out.println(n1+n2); //concatenation of two strings
		int x=Integer.parseInt(n1);
		int y=Integer.parseInt(n2);

		System.out.println(x+y); //Addition of two numbers
		
		//Autoboxing and Autounboxing --- this feature introduced in jdk5
		Integer inn=new Integer(30); // old manual auto boxing -deprecated not used anymore
		int in=(int)inn; // this is old manual unboxing
		
		Integer ii=Integer.valueOf(10); // wrapper - Integer is wrapper class
		int n=ii; //Auto unboxing - putting a wrapper to int 
		Integer iii=n; //auto boxing - putting an int to wrapper 
		
	}
}
