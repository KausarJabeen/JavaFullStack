package mod1.day17;
/**
 * 
 * @author KAUSAR
 * The errors like StackOverflow error or OutofMemory error cannot be handled
 * whereas exceptions can be handled
 *
 */

public class ErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorDemo obj=new ErrorDemo();
		//obj.met();
		obj.met2();
	}
	int i=0;
	public void met() {		
		System.out.println(i%2==0?"Even.."+i:"Odd.."+i);		
		i++;
		if(i<1000) {
			met();
		}
	}
	public void met2() {
		String s;
		while(true) {
			s=new String("hello..........");
		}
	}
}
