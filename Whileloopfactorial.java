package loopprogram;
import java.util.*;
public class Whileloopfactorial {

	public static void main(String[] args) {
		int i , fact=1,num;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any numner to find factorial");
		num = sc.nextInt();
		i=num;
		while(i>=1) {
			fact = fact*i;
			i--;
			
			
		}
		System.out.println("factorial of " +num+ "is "+fact);
	}

}
