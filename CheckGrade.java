package ashwini;

import java.util.Scanner;

public class CheckGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 char grade;
		System.out.println(" enter the grades ");
		grade=sc.next().charAt(0);
		if(grade == 'A' || grade == 'a') 
		{
			System.out.println(" marks range is 90 - 100");	
		}
		else if (grade== 'B' || grade == 'b')
		{
			System.out.println("marks range is 60 - 89");
			
		}
		else if (grade== 'C' || grade == 'c')
		{
			System.out.println(" marks range is 40 - 59");
		}
		 else if(grade =='D' || grade== 'd')
				 {
			 System.out.println("marks range is 0 - 39 ");
				 }
		 else
		 {
			 System.out.println("invalid input"); 
		 }
	}
	

	}


