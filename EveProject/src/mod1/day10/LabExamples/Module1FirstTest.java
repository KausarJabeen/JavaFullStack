package mod1.day10.LabExamples;

public class Module1FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Module1 FirstTest 31 AUG 2021
		int anar[]= new int[] {1,2,3};
		System.out.println(anar[1]); // OUTPUT: 2
		
//		double d=123.45;
//		float f=(char)d;
//		System.out.println(f); // Output: 123.0
		
//		int i=0;
//		if(i) { // if statement can only take boolean values
//			System.out.println("hello");
//		}
		
//		int i;
//		int j;
//		outer:
//		for(i=1;i<3;i++) {
//			inner:
//			for(j=1;j<3;j++) {
//				if(j==2) {
//					continue outer;
//				}
//				System.out.println("value of i= " +i+ "\t value of j= "+j);
//			}
//		}
		
//		char c='c';
//		int i= 10;
//		double d=10;
//		long l=1;
//		String s="Hello";  
//		c=c+i; 
//		s+=i; // correct
//		i+=s;
//		c+=s;
		
//		 float f=1.3; 		// correct way is 1.3f
//		 char c="a";		// string value type cannot be stored/converted char which is of numeric type
//		 byte b=257;		// byte cannot hold value more than 127. byte can be of size -128 to 127
//		 boolean bb=null;	// null value cannot be converted to boolean TRU/FALSE
//		 int i=10;			//correct 
		
//		System.out.println((2%2!=0)?"Even number...":"odd number....");//ternary is best
		
//		int i=1;
//		int j=2;
//	//	if(i==1 &| j==2) { //compile time error
//		if(i==1 && j==2) { // CORRECT WAY
//			System.out.println(1);
//		}else {
//			System.out.println(2);
//		}
		
		
		/*
		 * int a;//valid identifier
		 * valid identifiers should follow the following rules
		 * 1.variable names cannot start with a number value
		 * 2.variable names cannot have special characters except $ and _
		 * 3.In between the name you can have numbers and $ and _ but not any other special character
		 * 4. You cannot have space also in between
		 
		 * 2age - invalid identifier - because the name starts with a number
		 * @age - invalid identifier - because the name starts with a special character other than $ and _
		 * $age - valid identifier
		 * _age - valid identifier
		 * a2ge - valid identifier - you can have numbers in between
		 * a2g_e$ - valid identifier
		 * ag e - invalid identifier - because there is a space
		 *
		 * YOU CANNOT CREATE A NAME WHICH IS A KEYWORD OR CLASSNAME IN JAVA
		 * The valid identifier concept applies to even the CLASS NAMES which u create.
		 */
//		1) 2variable		// invalid identifier
//		2) variable2		//valid
//		3) _whatavariable	//valid
//		4) _3_ 				//valid
//		5) $anothervar		//valid
//		6) #myvar			//invalid identifier

	}

}
