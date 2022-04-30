package loopprogram;
import java.util.*;
public class FactorsNumbers {

	public static void main(String[] args) {
    int i=1;
    int fact=1;
      Scanner sc = new Scanner (System.in);
      System.out.println("enter the numbers");
      
     int num=sc.nextInt();
      do {
    	fact=fact*i;
    	i++;		
      }while(i<=num);
      System.out.println("\nFactorial of " +num+ " is: "+fact);
    			
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	