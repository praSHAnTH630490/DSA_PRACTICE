package com.loop;
import java.util.Scanner;
public class Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
	for (int i=n;i>=1;i--) {
		if(i%2==0) {
			for (int j=i;j<=i;j++)
			{
				System.out.println(j);
		}
		}
			
			else {
		for (int j=i;j>=1;j--) 
		{
			System.out.println(j);
	}
	System.out.println();
}
		}
	}
}

