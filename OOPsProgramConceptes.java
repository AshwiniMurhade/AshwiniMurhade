  package mypackoops;

import java.util.Scanner;

class Employee{
	String name;
	int id;
	float salary;
	int age;
	 void input() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter name,id,salary,age of Employee is");
		 name=sc.next();
		 id=sc.nextInt();
		 salary=sc.nextFloat();
		 age=sc.nextInt();
		// sc.close();	 
		 
	 }
	 void display() {
		 System.out.println("enter name=  "+name);
		 System.out.println("enter id= "+id);
		 System.out.println("enter salary= "+salary);
		 System.out.println("enter age= "+age);
		 
		 



		 
	 }
	public void info() {
				// TODO Auto-generated method stub

	}
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	}
	

public class OOPsProgramConceptes {
	
	public static void main(String[] args) {
		System.out.println("main method");
		Employee sob=new Employee();
		Employee sob1=new Employee();
		
		System.out.println(sob);
		System.out.println(sob1);
		
		
		sob.input();
		sob.display();
		sob1.input();
		sob1.display();


		
	}

}
