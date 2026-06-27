package com.Happy;
import java.util.Scanner;
public class SwichChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your lang:");
		String str = sc.next();
		switch (str) 
		{
		case "java":
		{
			System.out.println("Object oriented language");
			break;
		}
		case "c":
		{
			System.out.println("Procedure oriented language");
			break;
		}
		case "python":
		{
			System.out.println("Object oriented language");
			break;
		}
	}
	}
}
