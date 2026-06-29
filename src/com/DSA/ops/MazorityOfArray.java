package com.DSA.ops;

public class MazorityOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,3,4,5,5};
		int count = 0;
		int pos = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j=i ; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				count++;
				pos = arr[i];
				break;
			}	
		}
		}
		if(count==0) {
			System.out.println("Repeated: "+pos);
		}

	}

}
