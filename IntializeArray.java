package arrrayjava;

public class IntializeArray {

	public static void main(String[] args) {
      int arr[] = {4,5,6,7,8};
      System.out.println("First array element "+arr[0]);
      System.out.println("Second array element "+arr[1]);
      System.out.println("Third array element "+arr[2]);
      System.out.println("Fourth array element "+arr[3]);
      System.out.println("Five array element "+arr[4]);

    System.out.println("Number of element in array "+arr.length);
    for(int i=0;i<arr.length;i++) {
    	System.out.println("arr["+i+"]= "+arr[i]);
    }
    
    //sum of array elements
    int sum=0;
    for (int i=0;i<arr.length;i++) {
    	sum= sum+arr[i];
    	
    	
    }
   System.out.println("the sum of all array is = "+sum);
    
    //to find minimum arrray
   int min=0;
	}

}
 