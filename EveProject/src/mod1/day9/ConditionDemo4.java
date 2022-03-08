package mod1.day9;

public class ConditionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch-case
		 * work on values
		 *
		 */
		//The below are the four possible values you can take for switch case
		int i=40;
		char c='a';
		String s="ramu";//jdk 7
		MyEnum e=MyEnum.apple;//jdk 5
		
		switch(i) {
		case 10:{
			System.out.println("no 10 is identified....");
			break;
		}
		case 20:{
			System.out.println("no 20 is identified...");
			break;
		}
		default:{
			System.out.println("default block executed...");
			break;
		}
		case 30:{
			System.out.println("no 30 is identified");
			break;
		}
		
		}
		
		switch(i) {
		case 10:{
			System.out.println("10 10 10 10......");
			break;
		}
		case 20:{
			System.out.println("20 20 20 20......");
			break;
		}
		default:{
			System.out.println("default called...");
			break;
		}
		case 30:{
			System.out.println("30 30 30 30");
		}
		}
		
		switch(c) {
		case 'a':{
			System.out.println("a for apple...");
			break;
		}
		case 'b':{
			System.out.println("b for bat....");
			break;
		}
		default:{
			System.out.println("no solution - as of now..");
		}
		}
		
		switch(s) {
		case "ramu":{
			System.out.println("hai ramu...............");
			break;
		}
		case "somu":{
			System.out.println("hai somu....................");
			break;
		}
		default:{
			System.out.println("default no welcome....");
		}
		}
		
		switch(e) {
		case apple:{
			System.out.println("enum apple found....");
			break;
		}
		case bat:{
			System.out.println("enum bat found....");
			break;
		}
		default:{
			System.out.println("default ......");
		}
		}
		
		
		
	}

}
