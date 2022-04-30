package ashwini;
import java.util.*;
public class ThreeLargestNumber {

	public static void main(String[] args) {
	 Scanner sc= new Scanner (System.in);
	     int num1 , num2 , num3 ;
	     System.out.println("enter the num1" );
	     num1=sc.nextInt();
	     System.out.println("enter the num2  ");
	     num2=sc.nextInt();
	     System.out.println("enter the num3");
	     num3=sc.nextInt();
	     if(num1>num2 && num1>num3)
	     {
	    	 System.out.println("the largest number is num1 = " +num1);
	     }	
	     else if(num2>num1 && num2>num3)
	     {
	    	 System.out.println("the largest number is num2 = " +num2); 
	     }
	    
	     
	   
	     else if(num3>num1 && num3>num2)
	     { 
	  	 System.out.println("the largest number is num3 = " +num3);
	    	 
	     }
	     else
	     {
	    	 System.out.println("two or three num are equal ");
	     }
	}
}
	 		     
	
	     
	
    

	


