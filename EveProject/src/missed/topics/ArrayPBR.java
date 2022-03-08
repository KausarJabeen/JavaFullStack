package missed.topics;


public class ArrayPBR {
	//Pass by Value
	/*
	public static void main(String[] args) {
		
		int i=10;
		System.out.println("Before Passing ....i..:"+i);
		met(i);
		System.out.println("After Passing....i..:"+i);
	}
	static void met(int i) {
		i=20;
	} */ 
	
	//Pass by reference
	//Arrays behave as PBR, because they're objects
	public static void main(String[] args) {
		
		int i[]= {10};
		System.out.println("Before Passing ....i..:"+i[0]);
		int copyI[]=new int[1];
		System.arraycopy(i, 0, copyI, 0, 1);
		met(copyI);
		System.out.println("After Passing....i..:"+i[0]);
	}
	static void met(int arr[]) {
		arr[0]=20;
	}
}

/*
 * critical error in programming
 * where ever you pass an array. the code will not qualify the quality test
 * your code is rejected. hence to overcome this 
 * whenever you pass an array, you should make an array copy and then pass .
 * so that the original is not changed, only the copy is passed
 * */
