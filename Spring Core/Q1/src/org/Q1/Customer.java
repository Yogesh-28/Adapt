package org.Q1;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void details() {
		System.out.println("Customer Id: " + getCustomerId());
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Customer Contact: " + getCustomerContact());
		System.out.println("Customer Address: " + getCustomerAddress().getStreet() + ", " + getCustomerAddress().getCity()
				+ ", " + getCustomerAddress().getState() + ", " + getCustomerAddress().getZip() + ", " + getCustomerAddress().getCountry());
	}
}