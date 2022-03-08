package realinterfaceimplpack;

public class TypeCastingTest2 {
	public static void main(String[] args) {
		Dancer dancing=(Dancer)getInstitute();
		dancing.doDance();
		
		dDoctor doctor=(dDoctor)getInstitute();
		doctor.doCure();
	}
	public static Object getInstitute() {
		return new Institute();
	}

}
class Institute implements dDoctor,Dancer{
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("Doctor curing");
		
	}@Override
	public void doDance() {
		// TODO Auto-generated method stub
		System.out.println("Dancer dancing");
	}
}

interface dDoctor{
	public void doCure();
}
interface Dancer{
	public void doDance();
}