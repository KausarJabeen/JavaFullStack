package mod1.day10.lab;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ArrayInteger [] = {7,21,30,60,80}; // Single Dimensional
		int ArrayInteger [] = new int [5];	
		ArrayInteger[0]= 7;
		int ArrayLength = ArrayInteger.length;
		System.out.println(ArrayLength);
		for(int i=0; i<ArrayLength; i++) {
			System.out.println(ArrayInteger[i]);
		}
		
	}

}
