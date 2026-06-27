package com.Arrays;
import java.util.*;
public class TwoDimeArray {

	public static void main(String[] args) {
		int i,j;
		int[][] a = new int[5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array value");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				a[i][j] =sc.nextInt();
			}
		}
        System.out.println("the even values are");
        for (i=0;i<5;i++) {
        	for (j=0;j<5;j++) {
        		if(j%2==0) {
        			System.out.println("is even "+j);
 
        		}
        		else {
        			System.out.println("not even");
        		}
        	}
        }
	}

}
