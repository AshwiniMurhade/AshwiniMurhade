package consex;
class A{
	A(){
		System.out.println("class A constructor");
	}
}
class B extends A{
	B(){
		System.out.println("class B constructor");	
	}
}
class C extends B{
	C(){
		
		System.out.println("class C constructor");	
	}

}
public class ContructorExecutionInheritanceMain {

	public static void main(String[] args) {
		C ob= new C();
	}
		
	}


