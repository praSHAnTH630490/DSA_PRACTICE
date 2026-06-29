package com.DSA.ops;

import java.util.Arrays;

public class NewposArray {
public static void newPos(int newVal,int[] arr,int size , int position) {
	if(position == 0 || position>=size) {
		System.out.println("Invalid Position");
	}
	else {
		arr[position] = newVal;
		System.out.println(position+" Updated new value "+newVal);
	}
}
	public static void main(String[] args) {
		int arr1[] = {1,2,4,5,6,7};
		NewposArray.newPos(34,arr1,arr1.length,3);
		System.out.println(Arrays.toString(arr1));

	}

}
