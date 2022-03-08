package mod1.day10.LabExamples;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first = 2.50f, second = 4.50f; 
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second); 
		 // Value of first is assigned to temporary
		float temporary = first; 
		 // Value of second is assigned to first
		first = second; 
		 // Value of temporary (which contains the initial value of first) is assigned to second
		second = temporary; 
		 System.out.println("--After swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second); 
		
		System.out.println("***************");
		 
		 	int n1=10;
			int n2=20;
			
			System.out.println(n1+":"+n2);
			
			int temp=n1;
			n1=n2;
			n2=temp;
			System.out.println(n1+":"+n2);
			//do the same exercise without temp variable...
	}

}
