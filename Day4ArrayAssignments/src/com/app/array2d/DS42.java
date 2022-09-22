/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS42 {
	int[][] add(int[][] arr1, int[][] arr2){
		int[][] sum = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		return sum;
	}
}
