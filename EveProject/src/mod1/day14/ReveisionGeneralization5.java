package mod1.day14;

public class ReveisionGeneralization5 {
	public static void main(String[] args) {
		Sub1 s1Obj=new Sub1();
		System.out.println("Sub1  refers variable i.."+s1Obj.i);
		s1Obj.met(12f);
		
		Sub2 s2Obj=new Sub2();
		System.out.println("Sub2  refers super variable i.."+s2Obj.i);
		s2Obj.met(13f);
		
		Super sup=new Sub1();
		System.out.println("Super class variable..."+sup.i);
		sup.met(14);
	
	}
	
}
class Super{
	int i=10;
	public void met(float l) {
		System.out.println("super class method.."+l);
	}
	
}
class Sub1 extends Super{
	int i=20; // variable declaration can be overridden i of super class
	public void met(int ss) {
		System.out.println("Sub1 class method called..."+ss);
	}
	
}
class Sub2 extends Super {
	
}