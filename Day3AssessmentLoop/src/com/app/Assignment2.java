/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment2 {
	public static void main(String[] args) {
		int n = 1;
		while(n <= 10) {
			boolean isPrime = true;
			for(int i = 2; i <= n/2; i++) {
				if(n%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(n + " is a prime number");
			}
			n++;
		}
	}
}
