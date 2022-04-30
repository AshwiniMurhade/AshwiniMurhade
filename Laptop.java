package relation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToOne  //many laptop will have one student
	private Student st;
	
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}

