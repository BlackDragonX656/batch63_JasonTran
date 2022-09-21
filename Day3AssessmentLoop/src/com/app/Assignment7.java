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
public class Assignment7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt(), res = 0;
		while(n > 0) {
			res=res*10+n%10;
			n=n/10;
		}
		System.out.println(res);
		s.close();
	}
}
