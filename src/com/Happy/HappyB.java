package com.Happy;
import java.util.Scanner;
public class HappyB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		System.out.println("a value before increment:"+a);
		b=a++;
		System.out.println("a value after increment"+a);
		System.out.println("b value after increment"+b);
		b=--a;
		System.out.println("b value after decrement"+b);
}
}
