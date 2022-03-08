package jdbcpack;

public class CloneDemo {
	public static void main(String[] args) {
		//Scenario 1 - Multiton - Properties are unique and resource is also unique
				Sheep mothersheep=new Sheep();
				Sheep dolly=new Sheep();
				
				mothersheep.name="i am the mother sheep..";
				dolly.name="i am the clone dolly..";
				
				System.out.println(mothersheep.name);
				System.out.println(dolly.name);
	
		//Scenario 2 - SingleTon - Properties are shared and resources also shared
				Sheep mothersheep2=new Sheep();
				Sheep dolly2=mothersheep2;
				
				mothersheep2.name="i am the mother sheep..";
				dolly2.name="i am the clone dolly..";
				
				System.out.println(mothersheep2.name);
				System.out.println(dolly2.name);
				
		//Scenario 2 - Cloning - Properties are unique and resources are shared..
				Sheep mothersheep3=new Sheep();
				Sheep dolly3=mothersheep3.creatClone();
								
				mothersheep3.name="i am the mother sheep..";
				dolly3.name="i am the clone dolly..";
				
				System.out.println(mothersheep3.name);
				System.out.println(dolly3.name);
	}
}

class Sheep implements Cloneable{
	String name; //property
	
	public Sheep() {
		System.out.println("sheep object created");
	}
	
	public Sheep creatClone() {
		try {
			return (Sheep)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
