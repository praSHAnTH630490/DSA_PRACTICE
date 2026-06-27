package com.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("revers order");
		for(int k = a.length-1;k>=0;k--) {
			
			System.out.println(a[k]);
		}
		System.out.println("using for each loop");
		for(int j : a) {
			System.out.println(j);
		}

	}

}
