package loopprogram;
import java.util.*;
public class ReversenumberWhile {

	public static void main(String[] args) {
		int num,i, digit;
		int rev =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		num =sc.nextInt();
		
		while(num >0 ) {
			digit = num %10;
			System.out.println(digit);
			num = num/10;
		}
	}

}
