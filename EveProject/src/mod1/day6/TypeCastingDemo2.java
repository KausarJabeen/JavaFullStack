package mod1.day6;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=257;
		
		byte b=(byte)i;//from 32 bit the int will be downsized to 8 bit
		
		System.out.println(b);
		
		short s=b;//automatic type promotion will happen- because smaller to higher
		
		float f=10.35f;
		
		int n=(int)f;
		
		System.out.println(n);
		
		char c='a';
		int nn=c;
		
		char cc=(char)nn;//for number type to  be stored in char, then casting is must..
				
	}

}
