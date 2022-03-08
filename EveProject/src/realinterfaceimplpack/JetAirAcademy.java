package realinterfaceimplpack;

public class JetAirAcademy implements Pilot,Steward{
	@Override
	public void doFly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying....");
	}
	@Override
	public void doServe() {
		// TODO Auto-generated method stub
		System.out.println("I do Serve in flight as I was taught");
	}
}
