package com.DSA.ops;

import java.util.Arrays;

public class ArrayTraverseZero {

	public static void main(String[] args) {
		int pos = 0;
		int arr[] = {3,0,2,0,5,0};
		int arr1[] = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == pos) {
				continue;
			}
			arr1[j] = arr[i];
			j++;
					}
		
        System.out.println(Arrays.toString(arr1));
	}
		
	}
