package accesswithpack;

import accessspecifierswithpack1.EmployeeSpecifiersAnotherPack;

class AccessSpecifiers{
	private int id;
	String name;
	protected  float fees;
	public  String cname;
	public AccessSpecifiers(int id, String name, float fees, String cname) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.cname = cname;
	}
	
}
public class AccessSpecifiersWithPackage {

	public static void main(String[] args) {
		AccessSpecifiers ob =new AccessSpecifiers(1,"ashwini",234.32f,"capgemini");
		//System.out.println(" id="+ob.id);error
		System.out.println("name="+ob.name);//default
		System.out.println("fees="+ob.fees);
		System.out.println("cname="+ob.cname);
		
		EmployeeSpecifiersAnotherPack eob=new EmployeeSpecifiersAnotherPack(23,"ashu",3425.44f,"infosys");
    //  System.out.println(" id="+ob.id);//private
	//	System.out.println(" ename="+eob.ename);//protected
		//System.out.println(" salary="+eob.salary);//default error cannot be accessed
		System.out.println("came="+eob.cname);//public access

	}

}
