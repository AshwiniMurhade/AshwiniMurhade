package mypackoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Emp {
	
String name;
int id;
float salary;
int age;
char gen;
 void input() throws IOException {
	// Scanner sc=new Scanner(System.in);
	 InputStreamReader is=new InputStreamReader(System.in);
	 BufferedReader br= new BufferedReader(is);
	 System.out.println("Enter name");
	 name=br.readLine();
	 System.out.println("Enter id");    
	 id=Integer.parseInt(br.readLine());
	 System.out.println("Enter salary");    
	 salary=Float.parseFloat(br.readLine());
	 System.out.println("Enter age");    
	 age=Integer.parseInt(br.readLine());
	 System.out.println("Enter gen");    
     gen=(char)br.read();
	// sc.close();	 
	 
 }
 void display() {
	 System.out.println("enter name=  "+name);
	 System.out.println("enter id= "+id);
	 System.out.println("enter salary= "+salary);
	 System.out.println("enter age= "+age);
	 System.out.println("enter gen= "+gen);
 
	 



	 
 }

}
public class OOPsBufferReader {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of emp");
		int n=sc.nextInt();
   Employee arr[]=new Employee[n];
    for(int i=0;i<arr.length;i++) {
	arr[i]=new Employee();
	arr[i].input();
	arr[i].display();
	
		
	}

}
}