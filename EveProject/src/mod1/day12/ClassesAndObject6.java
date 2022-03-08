package mod1.day12;
//PBV example Saturday, 11 September 2021

public class ClassesAndObject6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s[]= {"ram","rahim","john"};
//		new TrainingRoom().accept(s);
		TrainingRoom tr=new TrainingRoom();
		
		String s[]= {"ram","rahim","john"};
		tr.accept(s); // accept(argument) is a method of traininroom
		
		String ss[]=new String[] {"ramu","somu"};
		tr.accept(ss);
		
		String sss[]=new String[4];
		sss[0]="hello";
		sss[1]="hai";
		sss[2]="what";
		sss[3]="when";
		
		tr.accept(sss);
	}

}
class TrainingRoom{
	public void accept(String students[]) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		for(String s:students) { // using enhanced forloop
			System.out.println(s);
		}
	}
}