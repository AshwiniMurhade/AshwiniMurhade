package mypackoops;
class Area{
	void RectangleArea(int length,int width) {
		int Recarea=(length*width);
		System.out.println("Rectanglearea is="+Recarea);
	}
	void SquareArea(int side) {
		int Squarea=(side*side);
		System.out.println("Squarearea is="+Squarea);
	}
}
public class OverloadedArea {

	public static void main(String[] args) {
		Area ar=new Area();
		ar.RectangleArea(1,2);
		ar.SquareArea(1);
	}

}
