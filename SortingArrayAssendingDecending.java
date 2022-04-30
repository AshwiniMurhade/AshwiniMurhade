package arrrayjava;

public class SortingArrayAssendingDecending {

	public static void main(String[] args) { 
		
      int a[]= {2,1,3,4,5};
      int a[] = new int[]; 
      
      int temp;
      int n=0;
      System.out.println("elements of original array");
      
      
    	  for( i=0;i<n;i++ ) {
    		  for( j=0;j<n-1;j++) {
    			  if(a[j]<a[j+1]) {
    			  temp = a[j];
    			  a[j] = a[j+1];
    			  a[j+1] = temp;
    			  
    		  }
    	  }
    	  System.out.println("compare the i "+i+" with"+j+"and result in temp"+temp);
	}
    	  

}
