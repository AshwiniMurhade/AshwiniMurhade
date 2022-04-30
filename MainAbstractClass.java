package abst.com;

abstract class Animal{
	void sleep() {
		 System.out.println("zzzz");
		
		
	}
	public abstract void eat();
}
class cow extends Animal{
	@Override//annotation
	public void  eat() {//abstract method is override
		System.out.println("grass");
	}

void features() { //cow class method
	System.out.println("cows has horns");
}
}
public class MainAbstractClass {

	public static void main(String[] args) {
        cow ob=new cow();
        ob.eat();
        ob.sleep();
        ob.features();
        
        Animal ob1 =new cow();
        ob1.eat();
        ob1.sleep();
       // ob1.features(); ref to only animal 
        
      //  Animal ob3 = new Animal();abstract class can not instatiated;
	}

}
