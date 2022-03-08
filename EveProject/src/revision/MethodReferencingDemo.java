package revision;

public class MethodReferencingDemo {
	public MethodReferencingDemo() {
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInter4 my4=MyBusinessClass::mymethod;
		my4.met();
		
		MyInter4 my5=new MyBusinessClass()::mymethod2;
		my5.met();
		
		MyInter4 my6=MyBusinessClass::new;
		my6.met();
		
	
	}

}

interface MyInter4{
	public void met();
}
class MyBusinessClass{
	public MyBusinessClass() {
		System.out.println("constructor logic called....");
	}
	public static void mymethod() {
		System.out.println("my method called...");
	}
	
	public void mymethod2() {
		System.out.println("non static method called...");
	}
}