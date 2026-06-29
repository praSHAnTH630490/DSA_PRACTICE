package com.Myloop;
import java.util.*;
public class UniCodes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter n value: ");
		int n = sc.nextInt();
		for (int i = 0;i<5;i++) {
			for (int j=n;j<=69-i;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	
	}

}
