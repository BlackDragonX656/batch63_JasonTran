/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS32 {
	int max(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {		
			if(arr[i] > max) {
				max = i;
			}
		}
		return max;
	}
}
