package com.loop;
import java.util.Scanner;
public class Example {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum = 0;
	for (int i=0;i<n;i++) {
		for (int j=0;j<i;j++) {
		System.out.println("*");	
		}	
	}
	
}

}
