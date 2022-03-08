package mod1.day22;
import java.util.Scanner;
public class RefDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Paint paint=new RedPaint(); - this creates a static binding
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter the paint class name..:");
				String className=scan.next();
				/* 
				 * static
				 * 
				Paint paint=(Paint)Class.forName("mod1.day22.RedPaint")
						.getConstructor(String.class).newInstance("paint color");
				*/
				//dynamic
				Paint paint=(Paint)Class.forName(className)
						.getConstructor(String.class).newInstance("paint color");
				
				System.out.println(paint);
	}

}
abstract class Paint{
	
}
class RedPaint extends Paint{
	String name;
	public RedPaint(String name) {
		this.name=name;
	}
	
}
class BluePaint extends Paint{
	String name;
	public BluePaint(String name) {
		this.name=name;
	}
	
}