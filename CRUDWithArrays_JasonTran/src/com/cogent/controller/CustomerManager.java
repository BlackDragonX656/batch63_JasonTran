/**
 * 
 */
package com.cogent.controller;

import java.util.Scanner;

import com.cogent.repo.CustomerRepo;
import com.cogent.bean.CustomerBean;

/**
 * @author Jason Tran
 * @date: Sep 26, 2022
 * 
 */
public class CustomerManager {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CustomerRepo cr = new CustomerRepo();
		int choice = 0;
		while(choice != 4) {
			System.out.println("******************************");
			System.out.println("CUSTOMER MANAGERMENT SYSTEM");
			System.out.println("******************************");
			System.out.println("1. Add Customer");
			System.out.println("2. View All Customer");
			System.out.println("3. Search Customer by Id");
			System.out.println("4. Exit");
			choice = s.nextInt();
			if(choice == 1) {
				System.out.println("User selected 1");
				String addMore = "";
				while(!addMore.equals("N")) {
					long id;
					String name;
					System.out.println("Please enter customer Id");
					id = s.nextLong();
					s.nextLine();
					System.out.println("Please enter customer name");
					name = s.nextLine();
					cr.addCustomer(new CustomerBean(id,name));
					System.out.println("Customer Added Successfully.");
					System.out.println("Do you want to add more Customer? Press Y or N");
					addMore = s.nextLine();
				}
			}else if(choice == 2) {
				System.out.println("User selected 2");
				String[] customerList = cr.viewAllCustomer();
				System.out.println("Customer Id\tCustomerName");
				for(String st: customerList) {
					System.out.println(st);
				}
				String exit = "";
				System.out.println("Press N to exit and Y to Back to Main Menu");
				s.nextLine();
				exit = s.nextLine();
				if(exit.equals("N")) {
					break;
				}
			}else if(choice == 3) {
				System.out.println("User selected 3");
				String addMore = "";
				while(!addMore.equals("N")) {
					long id;
					System.out.println("Please enter customer Id");
					id = s.nextLong();
					s.nextLine();
					CustomerBean c = cr.searchCustomerById(id);
					if(c.getCustomerId() == id) {
						System.out.println("Customer Id\tCustomerName");
						System.out.println(c.getCustomerId() + "\t\t" + c.getCustomerName());
					}else {
						System.out.println("Customer does not exist");
					}
					System.out.println("Press Y to Search More or N to go to main menu");
					addMore = s.nextLine();
				}
			}
		}
		s.close();
	}

}
