package realinterfaceimplpack;

import malik.MoleculeFramework;

public class Demo {
	public static void main(String[] args) {
		AlopathyMedicalCollege stanleyMC=new AlopathyMedicalCollege(); //1907
		Object shoiab=new Human(); //1974
//		today i am checking 2021/8/5
		if(shoiab instanceof Doctor) {
			System.out.println("shoiab is doctor...");
		} else {
			System.out.println("shoiab is not a doctor");
		}
//		Doctor doctor=(Doctor)shoiab; compile time there is no error, but when run it shows error that human object cannot cast to doctor
		System.out.println("shoiab goes to medical college..");
		MoleculeFramework.setInterface(Doctor.class);  //allows dynamic binding of shoiab and doctor
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,stanleyMC}); //subjection
		if(shoiab instanceof Doctor) {
			System.out.println("shoiab is now a doctor");
		}
		Doctor doctorshoiab=(Doctor)shoiab; // this time it will be casted due to dynamic binding
											// now we see interface working in a dynamic fashion.
		doctorshoiab.doCure();
		
		JetAirAcademy ja=new JetAirAcademy();
		
		MoleculeFramework.setInterface(Pilot.class);
		MoleculeFramework.setInterface(Steward.class);
		
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,ja});
		Pilot pilot=(Pilot)shoiab;
		pilot.doFly();
		
		doctorshoiab=(Doctor)shoiab;
		doctorshoiab.doCure();
		
	}
}
