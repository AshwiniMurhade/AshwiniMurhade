package Classes;
import java.util.*;
public class ScannerMethod {
public static void main (String args[]) {
	   String name;
	   int age;
	   float fees;
	   char gender;
	   double loan;
	   Scanner input = new Scanner (System.in);
	    
	   System.out.println("Enter your age");
	   age = input.nextInt();
	   input.nextLine();
       System.out.println("Enter your name");
       name = input.nextLine();
       

       System.out.println("Enter your gender m/f ");
	   gender = input.next().charAt(0);
	    
	   System.out.println("Enter your loan amount");
	   loan = input.nextDouble();
	   
	   System.out.println("age =" +age);
	   System.out.println("name =" +name);
	   System.out.println("gender =" +gender); 
	   System.out.println("loan=" +loan); 
}
}