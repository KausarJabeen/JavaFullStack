package mod1.day5;

import java.util.Scanner;

public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables - Data types
		//1.Numbers is type of data representation
		//2.boolean is another type of data representation
		//3.character is another type of data representation
		//4. String is another type of data representation
		
		//Number type
		//whole number, floating numbers...
		
		
		short b=2000;//static assigning
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please give a number..below 127..:");
		byte bb=scan.nextByte();//dynamic assigning
		
		short s=-32768;  //16 bit - 001000100001100
		int i=-2147483648; // 32 bit - 001000100001100001000100001100
		long l=595959595;// 64 bit
		
		//floating - decimal types
		float f=1.2344f; //32 bit
		double d=2.45555; // 64 bit
		
		//character type
		char c='a'; //16 bit
		
		//yes or no type
		boolean boo=true;
		boolean booo=false;
		
		//text type
		String str="hello world...";//unlimited
		
		System.out.println("byte value...:"+b);
		System.out.println("byte dynamic input value from keyboard...:"+bb);
		System.out.println("short value...:"+s);
		System.out.println("int value....:"+i);
		System.out.println("long value....:"+l);
		
		//variable declaration
/*
		int i;
		String s;
		
		//variable initialization
		i=10;
		s="hello";
		float f=1.2f;
		float ff=20;
		byte b=111;
		short sss=20202;
		char c='c';
		char ccc=97;
		boolean bb=true;//u cannot give 0 or 1
		boolean bbb=false;
		
		//valid identifiers or valid name
		
		int a;//valid identifier
*/		
		scan.close();
	}

}