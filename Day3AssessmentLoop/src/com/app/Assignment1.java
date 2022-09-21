/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment1 {
	public static void main(String[] args) {
		int n = 5;
		boolean isPrime = true;
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
	}
}
