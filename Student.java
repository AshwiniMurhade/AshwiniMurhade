package relation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Student {
	@Id
	int rollno;
	String name;
	int marks;
 @OneToMany(mappedBy = "st")  //one student will have multiple laptop
	//@OneToMany
	List<Laptop> lp=new ArrayList<Laptop>();
	
	
	public List<Laptop> getLp() {
		return lp;
	}
	public void setLp(List<Laptop> lp) {
		this.lp = lp;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", lp=" + lp + "]";
	}
}

