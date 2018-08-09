package org.cap.model;

public class Account {

	private int accNo;
	private double openingBalance;
	private Customer customer;
	private String accountType;
	public Account(int accNo, double openingBalance, Customer customer, String accountType) {
		super();
		this.accNo = accNo;
		this.openingBalance = openingBalance;
		this.customer = customer;
		this.accountType = accountType;
	}
	public Account() {
		
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
}
