/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS312 {
	int[] rotate(int[] arr){
		int[] rotated = new int[arr.length];
		int index = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			rotated[index] = arr[i];
			index++;
		}
		return rotated;
	}
}
