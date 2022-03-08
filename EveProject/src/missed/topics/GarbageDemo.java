package missed.topics;

public class GarbageDemo {
	public static void main(String[] args) {
		GrandFather daddu=new GrandFather();
		System.out.println(daddu.getGold());
	
		daddu=null; //this is taken by GarbageCollection in real applications.
		System.gc(); //this also taken care by GC in real applications
		
//		System.out.println(daddu.getGold());
		
	}

}
class GrandFather{
	private String gold="gold is under the tree";
	
	protected String getGold() {
		return gold;
	}
	
	//finalize is like a Will Document.- gets called when GC removes this object or when it kills or destroys the object.
	
	@Override
	protected void finalize() throws Throwable {
		 System.out.println("finalize called...");
		 System.out.println(getGold());
	}
}