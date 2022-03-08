package mod1.day10.lab;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java has 6 relational operators
		//1.less than, 2.less than or equal to, 3.greater than, 4.greater than or equal to, 5.equal to, 6.not equal to

		// LessThanExample
		int a=2;
		int b=5;
		if(a<b) {
		 System.out.println("a is lesser than b");
		}
		
		// LessThanEqualExample // GreaterThan or equal to Example
		int c=4; // try c=5
		if(b<=c && b>=c) {
			System.out.println("b is less than or equal to c | b is greater than or equal to c");
		} else {
			System.out.println("b is greater than c");
		}
		
		// EqualToExample
		int d=2;
		if(d == a) {
			System.out.println("d is qual to a");
		}
		
		if(a != b) {
			System.out.println("a is not equal to b");
		}
	}

}
