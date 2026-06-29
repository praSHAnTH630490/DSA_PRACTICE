package com.loop;
import java.util.Scanner;
public class StrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number:");
		int start = sc.nextInt();
		System.out.println("enter second number:");
		int end = sc.nextInt();
		 
		for (int n =start;n<=end;n++) {
		int sum =0,temp;
		int Strong = sum;
		for(;n>0;) {
			temp = n%10;
			int product =1;
			for (int i=1;i<=temp;i++) {
				product = product*i;
			
			sum = sum+product;
			n=n/10;
		}
		
		if(Strong == sum) {
			System.out.println(sum+" is strong number");
		}
		else {
			System.out.println(sum+" is not a strong number");
		}
		sc.close();
	}
}
	}
}

