/**
 * 
 */
package com.app;

/**
 * @author Jason Tran
 * @date: Sep 21, 2022
 * 
 */
public class SumofFirst10 {

	public static void main(String[] args) {
		int i = 1, osum = 0, esum = 0;
		while(i <= 10) {
			osum+=i;
			esum+=i+1;
			i+=2;
		}
		System.out.println("The sum of odd no is "+ osum);
		System.out.println("The sum of even no is " + esum);
	}

}
