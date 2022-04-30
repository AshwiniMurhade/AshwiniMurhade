package loopprogram;
import java.util.*;
public class Sumofevenodd {

	public static void main(String[] args) {
		int i , sum;
		i=1;
		sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("to find sum of odd and even numbers");
		int n=sc.nextInt();
		int oddsum=0, evensum=0;
		for(i=1; i<=n;i++)
		{
			if(i%2 ==0) {
				evensum =evensum+i;
			}
			else {
				oddsum = oddsum+i;
				
			}
		}
		
      System.out.println( "oddsum = "+oddsum );
      System.out.println( "evensum = "+evensum );

	}

}
