package loopprogram;

public class ForloopPrimeornot {

	public static void main(String[] args) {
		int i, sum=0,c=0;
		int num=7;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
		{
				c++;
			}
		}
        if(c==2) {
    	  System.out.println(" prime");
      }else
      {
    	  System.out.println(" not prime");
      }
	}

}
