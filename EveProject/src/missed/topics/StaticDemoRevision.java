package missed.topics;
/**
 * 
 * @author KAUSAR
 * complex types
 * constructor
 * instance variable
 *
 */
public class StaticDemoRevision {
	public static void main(String[] args) {
		Bottle voiletBottle=new Bottle(new Color("voilet"));
	//	voiletBottle.color=new Color();
		
		Bottle blueBottle=new Bottle(new Color("blue"));
//		blueBottle.color=new Color();
		
		System.out.println(voiletBottle.color.color);
		System.out.println(blueBottle.color.color);
	
	}

}

class Bottle {
	Color color; //this is an instance variable
	public Bottle(Color color) {
		// TODO Auto-generated constructor stub
	this.color=color;
	}
}

class Color {
	String color;
	public Color(String color) {
		// TODO Auto-generated constructor stub
	this.color=color;
	}
	
}