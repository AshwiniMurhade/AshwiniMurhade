package ashwini;
import java.util.*;
public class ConditionalStatement {
public static void main(String[] args) {
	
	
 Scanner sc = new Scanner (System.in);
        int age ;
       // System.out.println(" enter the age "); 
        age=sc.nextInt();
        if(age>20)
        {
        	System.out.println(" age is eligible "  +age);
        }
        if(age<20)
        {
        	System.out.println("age is not eligiable "  +age);
        }
	} 
}
               