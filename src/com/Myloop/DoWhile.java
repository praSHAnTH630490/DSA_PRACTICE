package com.Myloop;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first value:");
		int a = sc.nextInt();
		System.out.println("enter second value:");
		int b = sc.nextInt();
		char option ;
		
		do 
		{
		System.out.println("enter action;");
		String str = null;
		char ch = sc.next().charAt(0);
		
		switch (ch) 
		{
		case '+':
		{
			int c = a+b;
		System.out.println(c);
		break;
		}
		case '-':
		{
			int c = a-b;
		System.out.println(c);
		break;
		}
		case '*':
		{int c = a*b;
		System.out.println(c);
		break;}
		case '/':
		{
			int c = a/b;
		System.out.println(c);
		break;
		}
		case '%':
		{
			int c = a%b;
		System.out.println(c);
		break;
		}
		}
		System.out.println("do you want to go again");
		option = sc.next().charAt(0);
		}
		while(option =='y' || option == 'Y');

}
}

