package mod1.day14;

public class GeneralizationDemo {
	public static void main(String[] args) {
		//A parent can hold any child
//		SuperClass sc=new SubClass1();
//		sc= new SubClass2(); 
		
//		or Object of a UsingClass can be used to Accommodate Subclasses of SuperClass
		UsingClass obj1=new UsingClass(); 

		obj1.sc=new SubClass1();
		obj1.sc=new SubClass2();
		
	}
}
class UsingClass{
	SuperClass sc;
}
class SuperClass{
	
}
class SubClass1 extends SuperClass{
	
}
class SubClass2 extends SuperClass{
	
}