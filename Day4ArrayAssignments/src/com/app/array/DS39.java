/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS39 {
	int[] removeElement(int[] arr, int target){
		int[] array = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != target) {
				array[index] = arr[i];
				index++;
			}
		}
		return array;
	}
}
