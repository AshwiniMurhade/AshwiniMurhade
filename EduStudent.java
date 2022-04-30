package edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EduStudent {
	@Id
private int sid;	
public String name;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}	
	

	
}
