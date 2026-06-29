package com.loop;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0,temp;
		while(n!=0) {
			temp = n % 10;
			rev = rev*10+temp;
			n=n/10;
		}
		System.out.println("the reverse is:"+rev);
	}

}
