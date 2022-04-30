package arrrayjava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int n=sc.nextInt();
		a= new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter search element");
		int key = sc.nextInt();
		  
		//linrear search
		int pos =0;
		for(int i=0;i<a.length;i++) {
			if(key == a[i]) {
				pos=i+1;
				break;
				
			}
		}
		
		if(pos>0) {
			System.out.println("Successful Search");
			System.out.println(key+" found at position "+pos);
		}
		else
		{
			System.out.println("Unsuccessful Search");
		}
	}
	
 
}
