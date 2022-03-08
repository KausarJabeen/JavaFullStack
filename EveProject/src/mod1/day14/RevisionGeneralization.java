package mod1.day14;
//1.Sub class replacing the super class
public class RevisionGeneralization {
	public static void main(String[] args) {
		Employee e=new Engineer();
		e=new Attender();
		acceptEmployee(new Engineer());
		acceptEmployee(new Attender());
		acceptEngineer(new Engineer());
//		acceptEngineer(new Employee()); Engineer accepts only engineer and not any other employee
	}
	public static void acceptEmployee(Employee e) {}
	public static void acceptEngineer(Engineer en) {}
}
class Employee{
	
}
class Engineer extends Employee{
	//Engineer is a kind of employee
}
class Attender extends Employee{
	//Attender is a kind of employee
}