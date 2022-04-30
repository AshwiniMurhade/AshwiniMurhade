//write a program for calculate electricity bill
package ashwini;
import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int units;
		System.out.println("enter the units");
		units=sc.nextInt(); 
		double amount;
		if(units<100) 
		{
			amount= units*0.80;
   }
	 	else if (units > 100 && units <=300)
	 	{
	 		amount = 100 * 0.80f + (units-100)*1;
	 	}
	 	else
	 	{
	 		amount = 100 * 0.80f + 200*1 + (units - 300)*2.50f;
	 	}
		System.out.println("Electricity bill for units "+units+ "in rs"+amount);
		}

	}


