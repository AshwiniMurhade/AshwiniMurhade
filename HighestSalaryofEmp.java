package mypackoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class HighestEmp{
	int id;
	String name;
	float salary;
	char gen;
    int age;
    String add;
    
    void info() throws IOException {
    	 
    	InputStreamReader is = new InputStreamReader (System.in);
    	BufferedReader br= new BufferedReader(null);
    	
    	System.out.println("Enter name: ");
    	name=br.readLine();
    	System.out.println("Enter id: ");
    	id=Integer.parseInt(br.readLine());
    	System.out.println("Enter salary: ");
    	salary=Float.parseFloat(br.readLine());
    	System.out.println("Enter gen: ");
    	gen=(char)br.read();
    	System.out.println("Enter age: ");
    	age=Integer.parseInt(br.readLine());
    	System.out.println("Enter salary: ");
    	add=br.readLine();
    
    }
    void Show() {
    	
    	System.out.println("Enter name: "+name);
    	System.out.println("Enter id: "+id);
    	System.out.println("Enter salary: "+salary);
    	System.out.println("Enter gen: "+gen);
    	System.out.println("Enter add: "+add);

    	
    	
    	
    	
    }
    
}
public class HighestSalaryofEmp {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of emp");
		int n=sc.nextInt();
       Employee[] arr=new Employee[n];
       float max=0;
       for(int i=0;i<n;i++) {
    	   
       
	    arr[i]=new Employee();
     	arr[i].info();
	    arr[i].show();
       
       
	    if(arr[i].salary>max) {
 		   max=arr[i].salary;
 	   }
	    System.out.println("max salary= "+max);
		
	}

	}
}