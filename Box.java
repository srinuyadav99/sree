public class Box {
	int height;
	int length;
	int breadth;
	public static void main(String[] args) {
		Box b=new Box();
		b.height=12;
		b.length=20;
		b.breadth=18;
		int area;
		area=(2*b.height*b.length*b.breadth);
		System.out.println("THE AREA IS :"+area);
	}
}