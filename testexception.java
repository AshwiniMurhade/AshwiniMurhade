package exception.com;

public class testexception {
	public static void parse(String s) {
	try {
		float f=Float.parseFloat(s);
	
	}
    catch(NumberFormatException e) {
    	e.printStackTrace();
    }
    finally {
    	System.out.println(f);
    }
}
	public static void main(String[] args) {
     parse("invalid");		
	}


}