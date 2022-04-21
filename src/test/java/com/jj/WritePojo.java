package com.jj;

import java.util.List;

public class WritePojo {
    private String firstName;
    private String lastname;
    private String emailID;
    private long phoneNo;
    private List<EmpDetails> data;
    
    
	public WritePojo(String firstName, String lastname, String emailID, long phoneNo,List data) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailID = emailID;
		this.phoneNo = phoneNo;
		this.data = data;
	}


	public List<EmpDetails> getData() {
		return data;
	}


	public void setData(List<EmpDetails> data) {
		this.data = data;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
    
	

}
