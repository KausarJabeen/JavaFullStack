package mod1.day10;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		while(i<10) {
			i++;
			if(i%2==0) {
				continue;//it means I am telling to jump to the loop once again
			}
			System.out.println(i);
			
		}
	}

}
