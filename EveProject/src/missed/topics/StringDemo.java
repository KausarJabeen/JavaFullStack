package missed.topics;
// String is also a object, similar to other wrapper class, String also is a wrapper
public class StringDemo {
	public static void main(String[] args) {
		String s="Hello world";  // in this case: only one value object is created.
		String ss=new String("Hello world"); // in this: one value object and one object gets created.
		// above two are not same
		
		// Strings are by default non mutable objects.
		
		String temp=s;
		s=s+"..hi world"; //new string s object is created.
		
		System.out.println(s);
		System.out.println(temp);
		
		s.replace('h', 'm');
		System.out.println(s);
		s=s.replace('h', 'm');
		System.out.println(s);

		String newvalue=s.replace('h', 'm');
		System.out.println(newvalue);

		/////
		String t1="hello world";
		String t2="hello world";
		System.out.println(t1==t2); // == is for comparison
		
		String t11=new String("hello world");
		String t22=new String("hello world");
		
		System.out.println(t11==t22); // incase of new string - you cannot use == for comparison
		System.out.println(t11.equals(t22)); //rather use this
		System.out.println(t11.hashCode()+":"+t22.hashCode());
		
		System.out.println(t11.charAt(6));
		System.out.println(t11.indexOf('w'));
		String sss=new String(new char[] {'a','b'});
		System.out.println(sss);
		System.out.println(t11.substring(0, 6));
		
	}
	
}
