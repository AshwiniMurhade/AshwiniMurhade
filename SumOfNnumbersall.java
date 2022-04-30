package loopprogram;
import java.util.*;
public class SumOfNnumbersall {

	public static void main(String[] args) {
		int i, sum, n;
		i=1;
		sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("input tne value of n");
		n=sc.nextInt(); 
		while(i <= n)
		{
			sum = sum+i;
			i=i+1;
			
		}
		    System.out.println("sum of 1 to " +n+ " natural numbers "  +sum);
	} 

}
