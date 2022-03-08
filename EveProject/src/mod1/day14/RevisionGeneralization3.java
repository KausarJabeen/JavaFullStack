package mod1.day14;
//3.code reusability - whatever declared in super class can be used in child class
public class RevisionGeneralization3 {
	public static void main(String[] args) {
		B bObj=new B();
		System.out.println("B obj called..."+bObj.i);
//		System.out.println("B obj called..."+bObj.j); // this will not be visible bcuz its a private variable
		bObj.met();
		
		A aObj=new B();
		System.out.println("A obj called..."+aObj.i);
		aObj.met();

		C cObj=new C();
		System.out.println("C obj called..."+cObj.i);
		cObj.met();
		
		
	}

}
class A{
	int i=10; 
	private int j=10;
	//for code re usability the only condition is: 
	// the variable should not be private: they will not be available outside the class
	public void met() {
		System.out.println("A class method called");
	}
}
class B extends A{
	
}
class C extends A {
	
}