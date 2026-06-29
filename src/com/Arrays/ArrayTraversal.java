package com.Arrays;

public class ArrayTraversal {

	public static void main(String[] args) {
		
		int[][] a = {{1,3,5},{3,6},{3,4,7,5}};
		for (int i = 0 ; i<a.length ; i++) {
			for (int j = 0 ; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
		
	}

}