 package arrrayjava;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		a=new int[n];
		 System.out.println("Enter elements in asending ");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Enter the element to be searched");
		 int key = sc.nextInt();
		 int l=0;
		 int h=n-1;
		 int mid=0;
		 int pos=0;
		  while(l<h) {
			  mid = (l+h)/2;
			  
			  if(key==a[mid]) {
				  pos = mid+1;
				  break;
				  
	  }
			  else if(key<a[mid]) {
				  h=mid-1;
				  
			  }
			  else if(key>a[mid]) {
				  l=mid+1;
				  
			  }
		  }
		if(pos>0) {
			System.out.println("Successful search");
			System.out.println(key+" found at position "+pos);
		}
		else {
			System.out.println("Unsuccessfull search");
		}

	}

}
