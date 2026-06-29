package com.loop;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<=10) {
			System.out.println(n+1);
			if (n==10)
			{
				continue;	
			}
		}
		sc.close();

	}

}
