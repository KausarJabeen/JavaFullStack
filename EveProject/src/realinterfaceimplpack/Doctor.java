package realinterfaceimplpack;

public interface Doctor {
	public void doCure(); 
	// an abstract method that doesn't have a body(without abstract keyword). 
	//logic or body implemented by the class that overrides it
	// interface is a special class with interface keyword that has abstract methods (without a body)

}
//Interface is a special class whose activity is promised to be implement by the class that implements it.
class UnaniMedicalCollege implements Doctor {
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("Unani way of cure method called");
	}
}
class AlopathyMedicalCollege implements Doctor {
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("Curing as per Alopathy medicine");
	}
}