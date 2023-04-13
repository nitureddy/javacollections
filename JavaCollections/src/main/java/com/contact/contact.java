package com.contact;

public class contact {
  private String fname;
  private String lname;
  private String contactNo;
  private String email;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public contact(String fname, String lname, String contactNo, String email) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.contactNo = contactNo;
	this.email = email;
}
@Override
public String toString() {
	return "contact [fname=" + fname + ", lname=" + lname + ", contactNo=" + contactNo + ", email=" + email + "]";
}

}
