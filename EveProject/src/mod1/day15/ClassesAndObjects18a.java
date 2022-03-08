package mod1.day15;
// Local InnerClass
//import mod1.day15.Kalimark.Cola;

public class ClassesAndObjects18a {

	public static void main(String[] args) {
		//syntax for creating an object of inner class
		//Kalimark.Cola cola=new Kalimark().new Cola();
		KalimarkCo kali =new KalimarkCo();
		kali.makeCola();
	}
} 
	class Pepsico{
//		public void makeCola(Kalimark.Cola cola) {
//			cola.makeCola();
//			System.out.println("cola filled in pepsi bottles...and sold...");
//		}
	}
	class KalimarkCo{
		public void makeCola() {
			//local inner class
			class Cola{
				public void makeCola() {
					facilitiesOfKali();
					System.out.println(money);
					System.out.println("cola is made by cola company");
				}
			}	
			new Cola().makeCola();
			System.out.println("cola filled in bovonto bottles...and sold...");
		}
		
		int money=100110000;
		public void facilitiesOfKali() {
			
		}
		
	}
