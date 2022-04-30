package mypackoops;

class Mycopyclass
{
	int i ,j;
	Mycopyclass(int i,int j){
	this.i=i;
	this.j=j;
	System.out.println("first object i="+this.i);
	System.out.println("first object j="+this.j);
}

     Mycopyclass(Mycopyclass firstobj) {
    	 this.i=firstobj.i;
    	 this.j=firstobj.j;
    	 System.out.println("second object i="+this.i);
    		System.out.println("second object j="+this.j);
     }
}
public class ProgramCopyConstructor {

	public static void main(String[] args) {
		Mycopyclass firstobj=new Mycopyclass(1,2);
		Mycopyclass Secondobj =new Mycopyclass(firstobj);
		

	}

}
