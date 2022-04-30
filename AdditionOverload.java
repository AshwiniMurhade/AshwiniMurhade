package mypackoops;

class Operation{
	
	
	void add(int i,int j){
		int add=i+j;
		System.out.println("integer addition is= "+add);
		
	}
	
	void add(double i,double j){
		double add=i+j;
		System.out.println("double addition is= "+add);
		
	}
	
	void add(float i,float j){
		float add= (float) (i+j);
		System.out.println("float addition is= "+add);
		
	}
	void add(short i ,short j) {
		short add=(short)(i+j); 
		System.out.println("short addition is= "+add);

	}
	void add(byte i ,byte j) {
		short add=(byte)(i+j); 
		System.out.println("byte addition is= "+add);
	}
	
	
}

public class AdditionOverload {

	public static void main(String[] args) {
		Operation ad= new Operation();
		ad.add(1,3);
		ad.add(1.1,2.2);
		ad.add(1.3f,4.1f);
		ad.add((short)3,(short)5);
		ad.add((byte)3,(byte)4);	
	

	}


}