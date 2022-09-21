/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment7 {
	public static void main(String[] args) {
		int a =10, b = 7, c = 20;
		if(a == b && b == c) {
			System.out.println("All three numbers are equal");
		}else {
			if(a > b) {
				if(a > c) {
					System.out.println("A is the biggest number");
				}else {
					System.out.println("C is the biggest number");
				}
			}else {
				if(b > c) {
					System.out.println("B is the biggest number");
				}else {
					System.out.println("C is the biggest number");
				}
			}
		}
	}
}
