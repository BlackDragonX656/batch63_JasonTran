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
public class Assignment6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(),b = s.nextInt(), product = 1;
		for(int i = 0; i < b; i++) {
			product *= a;
		}
		System.out.println(product + " is " + a + " raised to the power of " + b);
		s.close();
	}
}
