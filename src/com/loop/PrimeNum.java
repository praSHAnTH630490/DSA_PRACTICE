package com.loop;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count;
		for (;start < end;) {
			count=0;
			for(int i=1;i<=start;i++) {
				if (start%1==0) {
					count++;
				}
			}
				if (count==2) {
					System.out.println("is prime");
				}
				else {
					System.out.println("is not prime");
				}
			}
		}

	}


