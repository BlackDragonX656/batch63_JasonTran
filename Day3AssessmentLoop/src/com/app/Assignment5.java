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
public class Assignment5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int product = 1;
		for(int i = 2; i <= n; i++) {
			product *= i;
		}
		System.out.println(product + " is the factorial value of " + n);
		s.close();
	}
}
