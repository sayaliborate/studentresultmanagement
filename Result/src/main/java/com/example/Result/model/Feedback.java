package com.example.Result.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private long id;
private String name,emailid,feedback;
public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedback(long id, String name, String emailid, String feedback) {
	super();
	this.id = id;
	this.name = name;
	this.emailid = emailid;
	this.feedback = feedback;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}


}
