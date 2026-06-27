package com.Arrays;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int i,j;
		int[][] a = new int[4][];
		 a[0] = new int[2];
		 a[1] = new int[1];
		 a[2] = new int[2];
		 a[3] = new int[1];
		 a[0][0] = 34;
		 a[0][1] = 43;
		
		 a[1][0] = 76;
		 
		 a[2][0] = 34;
		 a[2][1] = 43;
		 
		 a[3][0] = 5;
		 
		 System.out.println("the given values are: ");
		 for(i=0;i<a.length;i++) {
			 for(j=0;j<a[i].length;j++) {
			 System.out.println(a[i][j]);
		 }
	}

}
}
