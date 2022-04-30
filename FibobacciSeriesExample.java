package hello;

public class FibobacciSeriesExample {

	public static void main(String[] args) {
		int n=10;
		int firstterm=0;
		int secondterm=0;
	    int thirdterm=1;
	    System.out.println("fibonaaci series till "+ n + "terms");
	   		for(int i=1 ;i<=n;++i) {
			 System.out.println(firstterm + " ");
			    System.out.println(secondterm + " ");
		int sum=firstterm + secondterm +thirdterm;
		 
		firstterm=secondterm;
		secondterm=thirdterm;
		thirdterm=sum;
		
	
		}

}
}
