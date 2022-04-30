package arrrayjava;

import java.util.Scanner;



public class UserInputarray {

	public static void main(String[] args) { 
		//declare an array
		int ar[];
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the size of array ");
		n=sc.nextInt();
		ar=new int[n];
		//input array
		System.out.println("enter "+n+"  array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();	
		}
		
		//displaying (printing) 
		System.out.println("Array elements is: ");
		System.out.print("{");
		for(int i=0;i<ar.length;i++) {
			if(i<ar.length-2)
			System.out.print(ar[i]+",");
			else if(i==ar.length-1) {
				
			}
		System.out.println();
		}	
		System.out.print("}");
	}

}
