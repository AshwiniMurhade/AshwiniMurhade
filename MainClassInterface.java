package intefc.com;
interface MyInterface{
	int i =10;//by default public static final
	void m1();// by default method are public abstract
	void m2();
	
}
interface AnotherInterface extends MyInterface{
	void m4();
	
}
class  B implements AnotherInterface{

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
	}
	
}
class  A implements MyInterface{

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		System.out.println("m1 method");
	}
	 void m3() {
	 System.out.println("m3 method");
}
}
public class MainClassInterface {

	public static void main(String[] args) {
		//MyInterface ob=new MyInterface()// interface method are abstract
		A ob=new A();
		ob.m1();
		ob.m2();
		ob.m3();
		
		B ob1=new B();
		ob1.m1();
		ob1.m2();
		ob1.m4();
	}

}
