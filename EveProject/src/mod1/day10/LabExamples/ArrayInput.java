package mod1.day10.LabExamples;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
//		 int[] array = new int[10];
		 int array[] = new int[10];
		 int sum = 0; 
		 System.out.println("Enter the elements:"); 
		 for (int i=0; i<10; i++) 
		 { 
		 array[i] = scanner.nextInt(); 
		 } 
		 scanner.close(); 
		 System.out.println(array.length);
	
		 for( int num : array) { 
		 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum);
	}

}
