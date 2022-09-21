/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class Assignment15 {
	public static void main(String[] args) {
		for(int i = 1; i <= 500; i++) {
			int n = i, res = 0, sum = 0;
			while(n>0) {
				res=n%10;
				sum = sum+ (int)Math.pow(res, 3);
				n=n/10;
			}
			if(sum == i) {
				System.out.println(sum);
			}
		}
	}
}
