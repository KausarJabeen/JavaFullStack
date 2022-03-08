package mod1.day14;

public class GeneralizationDemo2 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new RedPaint();
		brush.paint=new BluePaint(); 
		
		/*
		 * Paint is common noun, conceptually it does not exist
		 * hence object of common noun should not be created. 
		 *ie. why make a class abstract, so that object of which will not be allowed to create*/
		
//		Paint paint=new Paint(); // this should not be allowed
	}
}
class PaintBrush{
	Paint paint; // paint is a variable of Paint class a complex type variable
}
abstract class Paint{
	//common nouns are abstract in nature.
	//abstract class objects cannot be created.
	// To ensure that object of this is not created, we make this as abstract class
	// but still abstract class can have constructors
	public Paint() {
		System.out.println("Paint class Parent constructor called");
		//whend you create object of child class, Parent class constructor will be called.
	}
}
class RedPaint extends Paint{
	public RedPaint() {
		System.out.println("RedPaint child class constructor called");
	}
	
}
class BluePaint extends Paint {
	public BluePaint() {
		// TODO Auto-generated constructor stub
		System.out.println("BluePaint child class constructor called");
	}
}


/*
 * Despite of that we say that object of super class is created,
 * but you cannot create the object of super class directly.
 */

//MultiLevel inheritance can be achieved but not Multiple Inheritance is not accepted.
/* 
 * Example
 * abstract class Liquid{
 * }
 * abstract class Paint extends Liquid{ 
 *    this is a MultiLevel inheritance.
 *    public Paint() {
		System.out.println("Paint class Parent constructor called");
	}
 * }
 * 
 */