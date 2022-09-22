/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS45 {
	int[][] transpose(int[][] arr) {
		int[][] transpose = new int[arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		return transpose;
	}
}
