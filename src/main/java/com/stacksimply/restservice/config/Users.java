package com.stacksimply.restservice.config;

import javax.persistence.Entity;

@Entity
public class Users {
	
	
private int id ;
private String firstName ;
private String lastName ;
private String desc ;

public Users() {
	super();
}

public Users(int id, String firstName, String lastName, String desc) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.desc = desc;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

@Override
public String toString() {
	return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", desc=" + desc + "]";
}




}
