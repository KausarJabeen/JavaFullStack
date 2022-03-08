package mod1.day10.LabExamples;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'b'; 
		
		//char ch = 'i'; 
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) 
		 System.out.println(ch + " is vowel"); 
		else
		 System.out.println(ch + " is consonant");
		
		System.out.println("**********");
		
		char c='z';
		switch(c) {
		case 'a':{
			System.out.println("yes \"a\" is a vowel...");
			break;
		}
		case 'e':{
			System.out.println("yes \"e\" is a vowel...");
			break;
		}
		case 'i':{
			System.out.println("yes \"i\" is a vowel...");
			break;
		}
		case 'o':{
			System.out.println("yes \"o\" is a vowel...");
			break;
		}
		case 'u':{
			System.out.println("yes \"u\" is a vowel...");
			break;
		}
		default:{
			System.out.println(c+" is not a vowel....");
		}
		}
	}

}
