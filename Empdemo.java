package ashu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
//entity for table name will be class name ex Empdemo
@Entity(name="emp_hib")//to change the only table name
public class Empdemo {
	@Id//primary key
	@Column(name="emp_id")//to change column name
	private int eid;
	@Column(name="emp_name")
	@Transient    ///if dont want to store name
	private String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override//defined object class java.lang
	public String toString() {
		
		return "Empdemo[eid=" + eid+ ", name=" + name+"]";
	}
}
