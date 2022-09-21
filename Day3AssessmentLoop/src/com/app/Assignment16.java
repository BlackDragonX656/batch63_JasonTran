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
public class Assignment16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0, f1 = 0, f2 = 1;
		while(i < n) {
			if(i ==0) {
				System.out.println(f1);
			}else if(i==1) {
				System.out.println(f2);
			}else {
				System.out.println((f1+f2));
				int t = f1;
				f1 = f2;
				f2 += t;
			}
			i++;
		}
		s.close();
	}
}
