package revision;
public class LambdaDemo {
	public static void main(String[] args) {
		
		//1. Normal way
		MyInter myinter=new MyInterImpl();
		myinter.met();
		
		//2. Anonymous way
		MyInter myinter2=new MyInter() {
			
			@Override
			public void met() {
				System.out.println("anonymous way....................");
			}
		};
		myinter2.met();
		
		//3. Lambda way - this works only with functional interfaces
		MyInter myinter3=()->{System.out.println("lambda way...............");};
		myinter3.met();
		
		MyInter2 myinter4=()->{return 100;};
		System.out.println(myinter4.met());
		
		MyInter3 myinter5=(String s,int i)->{
			System.out.println("name is...:"+s);
			return s+":"+i;
		};
		System.out.println(myinter5.met("eve-aspire",50));
	}
}
class MyInterImpl implements MyInter{
	@Override
	public void met() {
		System.out.println("normal way.............................");	
	}
}
//functional interfaces can have only one method - only functional interfaces can be used in lambdas
@FunctionalInterface
interface MyInter{
	public void met();
}
interface MyInter2{
	public int met();
}
interface MyInter3{
	public String met(String s,int i);
}