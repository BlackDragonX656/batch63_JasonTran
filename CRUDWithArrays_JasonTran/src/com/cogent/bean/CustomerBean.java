/**
 * 
 */
package com.cogent.bean;

/**
 * @author Jason Tran
 * @date: Sep 26, 2022
 * 
 */
public class CustomerBean {
	private long customerId;
	private String customerName;
	
	public CustomerBean() {
		super();
		this.customerId = -1;
		this.customerName = "";
	}
	/**
	 * @param customerId
	 * @param customerName
	 */
	public CustomerBean(long customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
