package mod1.day12;
/*Command Line Arguments - 
 * public static void main(String[] args)  
 * in this main method String[] args is actually used as command line argument and we always access this
 * arguments can be passed like so ------ 
 * Right click --Run as- Run Configuration -- Look for particular class---- 
 * click on Argument tab--- enter the strings,, they are delimited by a space
 * 11 SEPT 2021: SATURDAY

*/

public class ClassesAndObjects7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[3]);
		for(String s:args) {
			System.out.println(s);
		}	

	}

}