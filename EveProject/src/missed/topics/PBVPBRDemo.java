package missed.topics;

public class PBVPBRDemo {
	public static void main(String[] args) {
		PBV_ChineseWhisper pbv= new PBV_ChineseWhisper();
		
		String myword="knightingale";
		System.out.println("Myword before passing...."+myword);

		pbv.accept(myword);
		System.out.println("Myword after passing...."+myword);
	
		Laddu laddu=new Laddu();
		PBR_IndianLaddu pbr=new PBR_IndianLaddu();
		
		System.out.println("My Laddu size before passing"+laddu.size);
		
		pbr.accept(laddu);
		System.out.println("My Laddu size after passing"+laddu.size);

	}
}
class PBV_ChineseWhisper{
	public void accept(String word) {
		word="alexander";
	}
	
}
class PBR_IndianLaddu {
	public void accept(Laddu laddu) {
		laddu.size=laddu.size-8;
		
	}
}

class Laddu {
	int size=10;
}