package com.DSA.ops;

import java.util.Arrays;

public class DelArrayEle {

	public static void main(String[] args) {
		int pos = 2;
		int arr[] = {3,4,2,4,5,6};
		int arr1[] = new int[arr.length-1];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(i == pos) {
				continue;
			}
			arr1[j]=arr[i];
			j++;
		}
        System.out.println(Arrays.toString(arr1));
	}

}
