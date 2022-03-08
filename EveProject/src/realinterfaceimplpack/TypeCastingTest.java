package realinterfaceimplpack;

public class TypeCastingTest {
	public static void main(String[] args) {
	Employee e=(Engineer)new Engineer();
	e.work();
	Employee ee=(Employee)getEmployee();
	ee.work();
	
	Engineer eee=(Engineer)getEmployee();
	eee.work();
	eee.doEngineering();
	
	}
	public static Object getEmployee() {
		return new Engineer();
	}
}
class Employee {
	public void work() {
		System.out.println("do work method called");
	}
}
class Engineer extends Employee {
	public void doEngineering() {
		System.out.println("do engineering");
	}
	
}