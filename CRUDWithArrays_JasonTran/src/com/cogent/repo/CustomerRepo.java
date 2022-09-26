/**
 * 
 */
package com.cogent.repo;

import com.cogent.bean.CustomerBean;

/**
 * @author Jason Tran
 * @date: Sep 26, 2022
 * 
 */
public class CustomerRepo {
	private CustomerBean[] customers;
	private int index;
	
	public CustomerRepo() {
		customers = new CustomerBean[100];
		index = 0;
	}
	
	public CustomerRepo(int size) {
		customers = new CustomerBean[size];
		index = 0;
	}
	
	public void addCustomer(CustomerBean customerBean) {
		customers[index] = customerBean;
		index++;
	}
	
	public String[] viewAllCustomer() {
		String[] l = new String[index];
		for(int i = 0; i < index; i++) {
			l[i] = customers[i].getCustomerId() + "\t\t" + customers[i].getCustomerName(); 
		}
		return l;
	}
	
	public CustomerBean searchCustomerById(long id) {
		for(int i = 0; i < index; i++) {
			CustomerBean cb = customers[i];
			if(cb.getCustomerId() == id) {
				return cb;
			}
		}
		return new CustomerBean();
	}
}
