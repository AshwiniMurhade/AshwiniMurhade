package consEx2;

class Parent {
	int id;
	void display() {
		System.out.println("parent class is fuction");
	}

	
}
class child extends Parent{
	void display() {
	super.display();
		System.out.println("child class is fuction");
	}

}
public class Overidingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child ob= new child();
		ob.display();
		System.out.println("id="+ob.id);

	}

}
