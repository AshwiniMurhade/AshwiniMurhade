package ashwini;
import java.util.*;
public class NumberPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number;
		
		System.out.print ("enter the number");
		number=sc.nextInt();
	
		if(number>=0)
		{
		System.out.println("number is positive");
		}
	 
		if (number<0)
		{
			System.out.println("number is negative");
		}

	}

}
