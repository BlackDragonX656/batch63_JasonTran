/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS37 {
	int[] merge(int[] arr1, int[] arr2){
		int size = arr1.length + arr2.length;
		int[] arr = new int[size];
		int i = 0;
		for(; i < arr1.length; i++) {
			arr[i] = arr1[i];
		}
		for(;i - arr1.length < arr2.length; i++) {
			arr[i] = arr2[i-arr1.length];
		}
		return arr;
	}
}
