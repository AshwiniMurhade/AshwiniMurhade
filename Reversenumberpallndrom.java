package loopprogram;

import java.util.Scanner;

public class Reversenumberpallndrom {

	public static void main(String[] args) {
		int i ,num, digit;
		int rev =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		num =sc.nextInt();
		
		while(num !=0 ) {
			digit = num %10;
		//	System.out.println(digit);
			rev = rev*10 + digit;
		
			num = num/10;
		}
		System.out.println("reversed number "+rev);
		if(num == rev)
	{
	
      System.out.println(" is pallandrome "+num);
	}
		else
		{
		System.out.println();
		}
	}

	}


