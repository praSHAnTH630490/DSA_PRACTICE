package com.Happy;
import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a value before swapping:"+a);
		System.out.println("b value before swapping:"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a value after swapping:"+a);
		System.out.println("b value after swapping:"+b);
		
}
}
