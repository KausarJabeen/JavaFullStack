package mod1.day14;
//2.Object Reusability
public class RevisionGeneralization2 {
	public static void main(String[] args) {
		Hall sHall= new Hall();
		sHall.party=new BirthdayParty();
//		sHall.party=new EngagementParty(); //specific only for bday parties
		
		GeneralHall gHall=new GeneralHall();
		gHall.party=new BirthdayParty();
		gHall.party=new EngagementParty();
	}

}
class Hall { // Specific hall - only for Birthday - it is not reusable for other parties	
	BirthdayParty party;
}
class GeneralHall{ // generic hall- for any party - it is re usable for  all parties
	Party party;
}
class Party {
	
}
class BirthdayParty extends Party{
	
}
class EngagementParty extends Party {
	
}