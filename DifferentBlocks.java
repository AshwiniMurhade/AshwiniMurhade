package mypackoops;

class Myblocks{
	static {
		System.out.println("Ananomus block");
		System.out.println("Executes before constructor after creation of an object");
	}
	 
	Myblocks(){
		System.out.println("Constructor block: executes of an object");
	}
}
public class DifferentBlocks {

	public static void main(String[] args) {
	
		System.out.println(" main method");
		Myblocks ob= new Myblocks();

	}

}
