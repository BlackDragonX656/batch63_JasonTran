/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS43 {
	void sort(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr.length-1; k++) {
					if(arr[k][j] > arr[k+1][j]) {
						int temp = arr[k+1][j];
						arr[k+1][j] = arr[k][j];
						arr[k][j] = temp;
					}
				}
			}
		}
	}
}
