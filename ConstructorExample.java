  package mypackoops;

class Myconstr {
 
int	i,j,k;
Myconstr(){
	System.out.println("inside class");
	
	i=3;
	j=4;
	k=5;
	System.out.println("i="+i+"j="+j+"k="+k);
 }

 Myconstr(int i,int j){
	 System.out.println("with argument");
	 this.i=i;
	 this.j=j;
	  
 }
  Myconstr(int i,int j, int k){
	  System.out.println("with argument");
	  this.i=i;
	  this.j=j;
	  this.k=k;
	  
  }
   void largestnum() {
	   int  l =(i>j)?i:j;
	   System.out.println("largest number"+l);
   }
   void largestthree() {
   int  l =(i>j && i>k)?i:(j>i && j>k)?j:k ; 
	   System.out.println("largest number three number"+l);
   }
   
   
   }
public class ConstructorExample {

	public static void main(String[] args) {
		
		Myconstr ob = new Myconstr();
		Myconstr ob1 = new Myconstr(1,2);
		Myconstr ob2 = new Myconstr(1,2,3);
		ob.largestthree();
		ob1.largestnum();
		ob2.largestthree();
	}

}
