package mod1.day12;

public class ClassesAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaintBrush paint=new PaintBrush();
		paint.doPaint(1);
		paint.doPaint(2);
		paint.doPaint(0);

	}

}
class PaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Painting red colour....");
		}
		else if(i==2) {
			System.out.println("blue colour....");
		}
		else {
			System.out.println("green colour....");
		}
	}
}