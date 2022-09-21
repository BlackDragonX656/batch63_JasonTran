/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class ReverseNo {
	public static void main(String[] args) {
		int n = 123, res = 0;
		while(n > 0) {
			res=res*10+n%10;
			n=n/10;
		}
		System.out.println(res);
	}
}
