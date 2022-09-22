/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS36 {
	int[] removeDup(int[] arr){
		int[] unique = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for(int j = 0; j < index; j++) {
				if(arr[i] == unique[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				unique[index] = arr[i];
				index++;
			}
		}
		return unique;
	}
}
