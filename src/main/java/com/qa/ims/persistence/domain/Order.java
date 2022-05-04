package com.qa.ims.persistence.domain;

public class Order {

	private Long id;
	private Long customerID;
	

	public Order(Long customerID) {
		super();
		this.customerID = customerID;
	}

	
	public Order(Long id, Long customerID) {
		super();
		this.id = id;
		this.customerID = customerID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	

	@Override
	public String toString() {
		return "Order: " + id + ", customer ID: " + customerID;
	}

}
