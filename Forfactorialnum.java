package loopprogram;
import java.util.*;
public class Forfactorialnum {

	public static void main(String[] args) {
		int i , fact = 1,num;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter any numbers to find factorial");
		num = sc.nextInt();
		for(i=num; i>=1;i--)
		{
			fact= fact*i;
			
		}
		 System.out.println("factorial of "+num+ "is "+fact);
	
	

	}

}
