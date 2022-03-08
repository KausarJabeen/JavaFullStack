package mod1.day5;

public class DataTypesAndVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21_474_83_645 ;//32 bit
		byte b=10;//8 bit
		short s=100;//16 bit
		long l=232323;//64 bit
		/*
		 * valid identifiers should follow the following rules
		 * 1.variable names cannot start with a number value
		 * 2.variable names cannot have special characters except $ and _
		 * 3.In between the name you can have numbers and $ and _ but not any other special character
		 * 4. You cannot have space also in between
		 */
		/*
		 * int a; valid identifier
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
		float f=1.234343f;//32 bit
		double d=23.344;//64 bit
		
		char c='a';
		char cc=100;//in java character is internally stored as number
		
		boolean boo=true;
		boolean boo2=false;
		
		String str="hello world";
	}

}
