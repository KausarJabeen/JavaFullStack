package mod1.day14;

/*
 * 'this' keyword represents the current object
 * rules
 * 'this' keyword cannot be used inside static methods
 */

public class ClassesAndObject13 {
	int age=100;//instance variable
	public ClassesAndObject13(int age) {  //parameterized constructor
		System.out.println(age);
		System.out.println(this.age);
//		new Receiver().met(new ClassesAndObject13(100));  //-recursion-uncontrolled
		new Receiver().met(this);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassesAndObject13(10);
	}

}
class Receiver{
	public void met(ClassesAndObject13 obj) { //Pass by Reference)
		obj.age=1000;
	}
}