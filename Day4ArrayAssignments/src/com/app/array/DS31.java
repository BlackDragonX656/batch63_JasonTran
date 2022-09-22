/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS31 {
	int search(int[] arr, int target){
		int index = -1;
		for(int i = 0; i < arr.length; i++) {		
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		return index;
	}
}
