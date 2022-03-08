package missed.topics;

/**
 * 
 * @author KAUSAR
 * static fields and static method
 *
 */

public class AmravathyDemo {
	public static void main(String[] args) {
		/*
		System.out.println("CM : Chandrababu government....");
		System.out.println("-------------------------------");

		BadAmravathy badProject=new BadAmravathy();
		badProject.buildMonument(); // infinite loop running discarded project
		*/
		
		System.out.println("Eve government....");
		System.out.println("------------------");
		
		Roads singaporeRoads=new Roads();
		Airport adaniAirport=new Airport();
		RailwayStation JapanBulletTrain=new RailwayStation();
		BusStand dubaiBusStand=new BusStand();
		Water gangaWater=new Water();
		Drainage longdonDrainage=new Drainage();
		
		GoodAmravathyHome.buildInfra(singaporeRoads, dubaiBusStand, JapanBulletTrain, adaniAirport, gangaWater, longdonDrainage);
		
		GovtApproval kausarPlotApproval=new GovtApproval();
		BuyPlot kausarPlot=new BuyPlot();
		
		GovtApproval nihalPlotApproval=new GovtApproval();
		BuyPlot nihalPlot=new BuyPlot(); 
		
		GoodAmravathyHome kausarHome=new GoodAmravathyHome(kausarPlot, kausarPlotApproval);
		kausarHome.buildHome();
		
		GoodAmravathyHome nihalHome=new GoodAmravathyHome(nihalPlot, nihalPlotApproval);
		nihalHome.buildHome();
		
	}
}
class BadAmravathy {
	public void buildMonument() {
		//this job was going on for 5 years...
		while(true) {
			//infinite loop
		}
	}
}
class GoodAmravathyHome{

		
	/*// why we have not used static block like this below?
	static {
		Roads roads;
		BusStand busStand;
		RailwayStation railwayStation;
		Airport airport;
		Water water;
		Drainage drainage;
	} */
	
	//All the plots will share common infrastructure
		static Roads roads;
		static BusStand busStand;
		static RailwayStation railwayStation;
		static Airport airport;
		static Water water;
		static Drainage drainage;
	
	
	//instance variable: bcoz every home witll have unique plot and unique approval
	BuyPlot buy_plot; GovtApproval govt_Approval; //instance variable
	
	public static void buildInfra(Roads roads,BusStand busStand,RailwayStation railwayStation,Airport airport,
			Water water,Drainage drainage) {
		GoodAmravathyHome.roads=roads;
		GoodAmravathyHome.busStand=busStand;
		GoodAmravathyHome.railwayStation=railwayStation;
		GoodAmravathyHome.airport=airport;
		GoodAmravathyHome.water=water;
		GoodAmravathyHome.drainage=drainage;
			
	}
	
	//home object should be constructed first with buying a plot and getting the approval
	 public GoodAmravathyHome(BuyPlot buy_plot, GovtApproval govt_approval) {
		// TODO Auto-generated constructor stub
		 this.buy_plot=buy_plot;
		 this.govt_Approval=govt_approval;
	}
	 
	 public void buildHome() {
		System.out.println("I am  using.....:"+GoodAmravathyHome.roads);
		System.out.println("I am  using.....:"+GoodAmravathyHome.busStand);
		System.out.println("I am  using.....:"+GoodAmravathyHome.railwayStation);
		System.out.println("I am  using.....:"+GoodAmravathyHome.airport);
		System.out.println("I am  using.....:"+GoodAmravathyHome.water);
		System.out.println("I am  using.....:"+GoodAmravathyHome.drainage);
		
		System.out.println("I purchased a plot to build home...:"+this.buy_plot);
		System.out.println("I got approval to build home...:"+this.govt_Approval);
	
		
		System.out.println("I am building Home Sweet Home..");
		System.out.println("-------------------------------------");
	}
	
}

// Basic Common Infrastructure class Roads, BusStand, RailwayStation, Airport, Water, Drainage
class Roads {}
class BusStand {}

class RailwayStation {}
class Airport {}

class Water {}
class Drainage {}

class BuyPlot {}
class GovtApproval {}