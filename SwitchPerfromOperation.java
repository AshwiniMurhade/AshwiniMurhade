package ashwini;
import java.util.*;
public class SwitchPerfromOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float num1,num2,result;
		int choice;
		
		System.out.println("enter the first number");
		num1=sc.nextFloat();
		System.out.println("enter the second number");
		num2=sc.nextFloat();
	
		System.out.println("1.additin");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			result = num1+num2;
			System.out.println("the sum of "+num1+ "and" +num2+ "is "+result);
			break;
		case 2:
			result=num1-num2;
			
			System.out.println("the sub of "+num1+ "and " +num2+ "is " +result);
			break;
		case 3:
			 result=num1*num2;
			System.out.println("the mul of "+num1+ "and " +num2+ "is " +result);
			break;
		case 4:
		 result=num1/num2;
			System.out.println("the sub of "+num1+ "and " +num2+ "is " +result);
			break;
		default :
			System.out.println("invalid input");
			break;
		}
		

	}

}
