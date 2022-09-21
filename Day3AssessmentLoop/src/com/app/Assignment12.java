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
public class Assignment12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,con = 0;
		do{
			System.out.println("Enter two numbers: ");
			a = s.nextInt();
			b = s.nextInt();
			System.out.println((a+b));
			System.out.println("Continue(0 for no, 1 for yes)?:");
			con = s.nextInt();
		}while(con != 0);
		s.close();
	}
}
