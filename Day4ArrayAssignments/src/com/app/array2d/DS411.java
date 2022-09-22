/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS411 {
	void switchAcrossRows(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i][arr[i].length-1];
			arr[i][arr[i].length-1] = arr[i][0];
			arr[i][0] = temp;
		}
	}
}
