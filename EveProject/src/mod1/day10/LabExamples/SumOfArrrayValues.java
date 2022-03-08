package mod1.day10.LabExamples;

public class SumOfArrrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {10, 20, 30, 40, 50, 10}; // correct way of declaring and initializing array
//		int array[] = {10, 20, 30, 40, 50, 10}; // correct way of declaring and initializing array
		int array[] = new int[6];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 10;
		int sum = 0; 
		//Advanced for loop or Enhanced for loop
		for( int num : array) { 
		 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum);
	}

}
