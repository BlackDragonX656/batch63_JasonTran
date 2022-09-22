/**
 * 
 */
package com.app.array2d;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS44 {
	boolean equals(int[][] arr1, int[][] arr2) {
		if(arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] != arr2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
