package mod1.day14;

public class GeneralizationDemo3 {
	public static void main(String[] args) {
//		Pizza pizza =new Pizza(); // cannot instantiate type Pizza 'coz Paint class is abstract and creating an object of it is not allowed
		Pizza pizza1=new McDonald();
//		pizza.shape="zig zag"; //final variable cannot be re assigned
		Pizza pizza2=new PizzaHut();
		System.out.println(pizza2.shape);
		System.out.println(pizza1.shape);
		pizza1.bakePizza();
		

	}

}
/*
 * When i declare a parent or a super class, the rules are:
 * 1. The Super class should be abstract
 * 2. The Variable i declare should be final
 * 3. All business methods i declare should be final.
 * */
abstract class Pizza{
	// final keyword : allowing the subclasses to use the variable but not change the variable
	final String shape="circle"; 
	
	final public void bakePizza() {
		System.out.println("Bake Pizza in an oven");
	}
}
class DominoPizza extends Pizza {
	
}
class PizzaHut extends Pizza{
	
}
class McDonald extends Pizza {
	/*
	 * Cannot override a final method
	public void bakePizza() {
		System.out.println("Bake Pizza in an kadai");
	}*/

}