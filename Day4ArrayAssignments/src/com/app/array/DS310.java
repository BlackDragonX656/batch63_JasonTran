/**
 * 
 */
package com.app.array;

/**
 * @author Jason Tran
 * @date: Sep 22, 2022
 * 
 */
public class DS310 {
	int[] findCommon(int[] arr1, int[] arr2){
		int size = arr1.length + arr2.length;
		int[] common = new int[size];
		int index = 0;
		for(int i: arr1) {
			for(int j : arr2) {
				if(i == j) {
					common[index] = i;
					index++;
				}
			}
		}
		return common;		
	}
}
