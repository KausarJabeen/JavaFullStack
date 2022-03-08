package mod1.day14;
//INHERITANCE
//Method Overriding
//over ridden methods should not change the return type
public class ClassesAndObjects14a {
	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.met();
	}
}
class ParentA{
	protected void met() {
		System.out.println("parent method called....");
	}
}
class ChildA extends ParentA{
	public void met() {//the return type of overriden method cannot be changed.
		System.out.println("child method called...");
		
	}
}
//levels of accessibility is - private,no-modifier,protected,public
//in overridden methods you cannot reduce the visibility