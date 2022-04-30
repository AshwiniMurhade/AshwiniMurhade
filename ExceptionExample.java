package exception.com;

public class ExceptionExample {

	public static void main(String[] args) {
      int a=9,b=0;
      int ans=0;
      
      System.out.println("before division");

      try {
          ans=a/b;
      }
      catch(ArithmeticException e)
         { 
    	  e.printStackTrace();
      }
      System.out.println("after division");
      System.out.println(ans);

	}
    
}