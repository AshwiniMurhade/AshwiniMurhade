package loopprogram;

import java.util.Scanner;

public class Forloopallfactorsgiveninput {

	public static void main(String[] args) {
		int i , num;
		Scanner  sc = new Scanner (System.in);
		System.out.println("enter the numbers");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(num%1==0) {
				System.out.println(i+" ");
			}
		}
		
	}

}
