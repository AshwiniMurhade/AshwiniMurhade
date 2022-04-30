package ashwini;
import java.util.*;
public class SwitchEvennumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("enter the numbers");
		num=sc.nextInt();
		switch(num%2) {
		case 1:
			System.out.println("the number is odd");
			break;
		case 0:
			System.out.println("the number is even");
			break;
		
		}
		
	}

}
