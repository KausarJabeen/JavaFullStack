package mod1.day16;
/*
 * Why we use Abstract class, abstract methods and Final methods and why we cannot create objects of abstract class
 *  
*/

public class ClassesAndObjects21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dominos laxmi=new LaxmiDomino();
		//Dominos laxmi=new Dominos(); // cannot create object of abstract class, this gives error
		laxmi.collectMoney();
		laxmi.makingPizza();
		laxmi.delivery();
	}

}
abstract class Dominos{
	final public void makeDough() {
		System.out.println("dough making as per dominos...");
	}
	final public void mixIngredients() {
		System.out.println("mix ingredients as per dominos...");
	}
	final public void bake() {
		System.out.println("baking piza as per dominos...");
	}
	final public void packing() {
		System.out.println("packing pizza as per dominos...");
	}
	final public void makingPizza() {//template method
		makeDough();
		mixIngredients();
		bake();
		packing();
	}
	public abstract void collectMoney();
	public abstract void delivery();
}
class LaxmiDomino extends Dominos{
	@Override
	public void collectMoney() {
		System.out.println("collect money the way I like...");
	}
	@Override
	public void delivery() {
		System.out.println("deliver pizza the way I like...");
	}
}