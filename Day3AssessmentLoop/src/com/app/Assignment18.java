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
public class Assignment18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1; 
		double sum = 0;
		while(i <= n) {
			sum += Math.pow(-1.0,i-1)*1.0/i;
			i++;
		}
		System.out.println(sum);
		s.close();
	}
}
