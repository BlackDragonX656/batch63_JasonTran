/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS48 {
	void printBoundary(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0 || j == 0 || i == arr.length-1 || j == arr.length-1)
					System.out.println(arr[i][j] + " ");
			}
		}
	}
}
