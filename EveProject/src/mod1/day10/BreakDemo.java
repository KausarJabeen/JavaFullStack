package mod1.day10;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break is also called as jumping statement
			int i=0;
			while(i<10) {
				i++;
				if(i==5) {
					break ;
				}
				System.out.println(i);
			}
			System.out.println("break has terminated the flow and now the cursor of the program is here..");
			
			//break can be used to come out of a lopp or
			//break can also be used to come out of a block
			
			india:{
				srilanka:{
					nepal:{
						if(i==5) {
							break india;
						}
					}
					System.out.println("break has come out of nepal...");
				}
				System.out.println("out of srilanka.......");
			}
			System.out.println("out of India....");
	}

}
