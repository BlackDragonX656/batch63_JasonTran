/**
 * 
 */
package com.app;

import java.util.Scanner;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
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
		s.close();
	}
}
