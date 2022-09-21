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
public class Assignment14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		while(s.hasNext()) {
			int n = s.nextInt();
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		s.close();
	}
}
