package mod1.day14;
/*
 * Access Specifiers
 * public,private,protected, no modifier
 * C:\Users\KAUSAR\Downloads\JAVA FULL STACK DEVELOPMENT\2\AccessSpecifier_Sept16_21.png
 */
public class ClassesAndObjects16 {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	public void met() {
		
		System.out.println(pri); //private is available and is a class scope and also other access specifiers
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}
class ClassesChildSamePack extends ClassesAndObjects16{
	public void met() {
		System.out.println(pri);//private is class scope - not accessible outside the class
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class ClassesChildSamePackNonChild {//no modifier and protected are by default package scope
	public void met() {
		ClassesAndObjects16 obj=new ClassesAndObjects16();
		System.out.println(obj.pri);//private is class scope - not accessible outside the class
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}

/*
 mod1.day14444;
 * DifPackSubClass.java 
 * */
 