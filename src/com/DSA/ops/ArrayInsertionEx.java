package com.DSA.ops;

import java.util.Arrays;

public class ArrayInsertionEx {

	public static void main(String[] args) {
		
		
		int[] arr = {1,8,3,9,2,47};
		int pos = 3;
		int ele = 44;
		 int[] arr1 = new int[arr.length+2];
		 for(int i=0;i<pos;i++) {
			   arr1[i] = arr[i];    
		 }
		 arr1[pos] = ele;
		 arr1[pos+1] = 45;
		 for(int i=pos ; i< arr.length;i++) {
			 
			 arr1[i+1]=arr[i];
		 }
		 System.out.println("old"+Arrays.toString(arr));
		 System.out.println("New"+Arrays.toString(arr1));
	}
}

