package com.bank;

public class Account {
	String accNo;
	String accType;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Account(String accNo, String accType) {
		super();
		this.accNo = accNo;
		this.accType = accType;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + "]";
	}
	
	

}
