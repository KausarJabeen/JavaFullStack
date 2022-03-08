package mod1.day9;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,12,40};//one row and 4 columns - single dimensional array
		
		arr[0]=200;
		System.out.println(arr[0]);
		
		System.out.println(arr.length);//in a single dimensional array, length will return number of columns
		
		//String sarr[]= {"apple","bat","cat"};
		String sarr[]=new String[5];
		sarr[0]="apple";
		sarr[1]="bat";
		sarr[2]="cat";
		sarr[3]="dog";
		sarr[4]="elephant";
		//sarr[5]="fan";
		System.out.println(sarr.length);
		System.out.println(sarr[4]);
		
		//Another Example
		int i[]= {22,34,56,78};
		
		int []j= {34,56,78,89,78,90};
		
		System.out.println(i.length);//this will return the length of the array i
		System.out.println(j.length);//this will return the length of the array j
		
		System.out.println(i[2]);
		System.out.println(j[1]);
		
		//System.out.println(j[6]);
		
		//non initialized array
		int k[]=new int[5];//the default value will be initialized - which is zero incase of int
		int []z=new int[3];
		
		k[0]=1000;
		k[2]=4000;
		
		System.out.println("k[0] value...:"+k[0]);
		System.out.println("k[1] vaue....:"+k[1]);
		
		int n=0;
		while(n<k.length) {
		System.out.println(k[n]);
		n++; 
		}
	}

}
