package com.Arrays;
import java.util.*;
public class MultyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int rows =0;
		int colums =0 ;
		int[][] a = new int [rows][colums];
		
		for(int m =0;m<=size-1;m++) {
		for(int j=0;j<=size-1;j++) {
		   System.out.println("enter rows");
		   rows = sc.nextInt();
		   
		System.out.println("enter column");
		   colums = sc.nextInt();
		
		
		for (int i = 0 ; i<a.length ; i++) {
			for (int j1 = 0 ; j1<a.length-1; j1++) {
				System.out.print(a[i][j1]+" ");
			}
			System.out.println();
		}
		}
		}
	}
	}
