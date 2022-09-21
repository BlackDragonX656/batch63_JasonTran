/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment11 {
	public static void main(String[] args) {
		int a = 20, b = 30, hcf = 0;
		for(int i = 1; i <= a; i++) {
			if(a%i == 0 && b%i == 0) {
				if(i > hcf) {
					hcf = i;
				}
			}
		}
		System.out.println("The HCF is " + hcf);
	}
}
