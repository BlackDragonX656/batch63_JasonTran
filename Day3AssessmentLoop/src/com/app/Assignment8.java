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
public class Assignment8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, osum = 0, esum = 0;
		while(s.hasNext()) {
			n = s.nextInt();
			if(n%2 == 0) {
				esum += n;
			}else {
				osum += n;
			}
		}
		System.out.println("The sum of odd no is "+ osum);
		System.out.println("The sum of even no is " + esum);
		s.close();
	}
}
