/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS410 {
	int sumOfDiagonals(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
			sum += arr[i][arr[i].length-1-i];
		}
		return sum;
	}
}
