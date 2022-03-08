package mod1.day12;

public class OddEvenFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenFinder obj=new OddEvenFinder();
		obj.checkNumber(10);
		String result=obj.checkNumber2(11);
		System.out.println("Result..:"+result);
	}
	public void checkNumber(int n) { // a method which doesnt return anything
		if(n%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number......");
		}
	}
	public String checkNumber2(int n) { // A method of returntype String
		if(n%2==0) {
			return "Even Number...";
		}
		else {
			return "Odd Number...";
		}
	}

}
