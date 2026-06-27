package com.Happy;
import java.util.Scanner;
public class TernoryOp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int value = (a < b) ? (a < c ? a : c) :(b < c ? b:c);
	System.out.println("a value is"+a);
	System.out.println("b value is"+b);
	System.out.println("c value is"+c);
	System.out.println("small value is"+value);
}
	
}
