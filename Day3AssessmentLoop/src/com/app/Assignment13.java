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
public class Assignment13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int poscnt = 0, mincnt = 0, zeroes = 0;
		while(s.hasNext()) {
			int n = s.nextInt();
			if(n < 0) {
				mincnt++;
			}else if(n > 0) {
				poscnt++;
			}else {
				zeroes++;
			}
		}
		System.out.println("The number of positives is " + poscnt);
		System.out.println("The number of negatives is " + mincnt);
		System.out.println("The number of zeroes is " + zeroes);
		s.close();
	}
}
