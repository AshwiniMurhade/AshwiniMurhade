package ashwini;
import java.util.*;
public class CalculateAvrageOfStu {

	public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     float sub1,sub2,sub3,sub4,sub5;
     float total,average;
     System.out.println("enter the subject");
     sub1=sc.nextFloat();
     System.out.println("enter the sub1 marks");
     sub2=sc.nextFloat();
     System.out.println("enter the sub2 marks");
     sub3=sc.nextFloat();
     System.out.println("enter the sub3 marks");
     sub4=sc.nextFloat();
     System.out.println("enter the sub4 marks");
     sub5=sc.nextFloat();
     System.out.println("enter the sub5 marks");
      total=(sub1+sub2+sub3+sub4+sub5)/5;
       average =(total/5);
    		  
    		  
     
	}

}
