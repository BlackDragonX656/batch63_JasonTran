/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS412 {
	void switchAcrossCols(int[][] arr) {
		for(int i = 0; i < arr[0].length; i++) {
			int temp = arr[arr[i].length-1][i];
			arr[arr[i].length-1][i] = arr[0][i];
			arr[0][i] = temp;
		}
	}
}
