package consEx2;
class Parents {
	int id;
	void display() {
		System.out.println("parent class is fuction");
	}

	
}
class childs extends Parents{
	int k;
	void display() {
	super.display();
		System.out.println("child class is fuction");
	}

void child_function() {
	System.out.println("child_function");
}
}
public class OverridingMain1 {

	public static void main(String[] args) {

		childs ob=new childs(); //memory allocation (both)
		ob.display();
		ob.child_function();
		System.out.println("id="+ob.id);
		
		Parents pob = new Parents();
		pob.display();	
		Parents p = new childs(); //memory is allocated only parent
		p.display();//overriden method parent method
		

		
		
		
	}

}
