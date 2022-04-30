package comfinalkeyword;

class Employee{
	 
	final static String cname="Microsoft";
	
	void change_method() {
		//cname =" Infosys";//error final values cannot be changed
	}
	
	final void add() {
		System.out.println("Addition final method");
	}
	
}

final class EduEmployee extends Employee{
	/*final void add() {//you cannot override in child
		System.out.println("child Addition final method");
	}*/
}

//class A extends EduEmployee{ //cannot inherit final class error
	
//}

public class MainFinal {
 public static void main(String[] args) {
	 EduEmployee ob = new EduEmployee();
	 ob.add();
}
}

