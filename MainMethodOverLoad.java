package mypackoops;

class FuctionOverload{
	
	void display() {
		System.out.println("No argument");
		
		}
	void display(int i) {
		System.out.println("one int argument");
	}
	void display(int i,int j) {
		System.out.println("two int argument");
	}
	
	void display(float i) {
		System.out.println("float  argument");
		
	}
	
	void display(float i,int j) {
		System.out.println("one float one int argument");
	}
	void display(float i,float j) {
		System.out.println("two float argument");
	}
}
public class MainMethodOverLoad {
	
	public static void main(String[] args) {
		
		FuctionOverload ob= new FuctionOverload();
		ob.display();//no argu
		ob.display(3);//one int arg
		ob.display(2,3);//two int arg
		ob.display(2.1f);//float arg
		ob.display(9.1f,3);//one float one int
		ob.display(3.2f,1.2f);//two float arg
		
	}

}
