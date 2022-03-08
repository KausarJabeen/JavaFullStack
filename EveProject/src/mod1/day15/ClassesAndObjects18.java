package mod1.day15;
/*
 * Inner classes
 * A class with in a class is called Inner class
 * 1. Broadly inner classes are classified as
 * a. Inner Class b. static inner class
 * a.1 - Inner class
 * a.2 - Local Inner class
 * a.3 - Anonymous Inner class
 */
public class ClassesAndObjects18 {
public static void main(String[] args) {
	//syntax for creating an object of inner class
	Kalimark.Cola cola=new Kalimark().new Cola();
	cola.makeCola();
}
}
class Pepsi{
	public void makeCola(Kalimark.Cola cola) {
		cola.makeCola();
		System.out.println("cola filled in pepsi bottles...and sold...");
	}
}
class Kalimark{
	public void makeCola(Cola cola) {
		cola.makeCola();
		System.out.println("cola filled in bovonto bottles...and sold...");
	}
	class Cola{
		public void makeCola() {
			System.out.println("cola is made by cola company");
		}
	}
	
}