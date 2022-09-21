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
public class Assignment20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rand = (int)(Math.random()*100);
		int guess = -1;
		while(guess != rand) {
			guess = s.nextInt();
			if(guess > rand) {
				System.out.println("Too high, try again.");
			}else if (guess < rand) {
				System.out.println("Too low, try again.");
			}else {
				System.out.println("You got it");
			}
		}
		s.close();
	}
}
