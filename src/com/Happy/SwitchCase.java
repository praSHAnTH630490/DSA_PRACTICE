package com.Happy;
import java.util.Scanner;
public class SwitchCase 
{
public static void main(String[] args) throws Exception 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first value:");
	int a = sc.nextInt();
	System.out.println("enter second value:");
	int b = sc.nextInt();
	System.out.println("enter action;");
	String str = null;
	char ch = (char)(System.in.read());
	
	switch (ch) 
	{
	case '+':
	{int c = a+b;
	System.out.println(c);
	break;}
	case '-':
	{int c = a-b;
	System.out.println(c);
	break;
	}
	case '*':
	{int c = a*b;
	System.out.println(c);
	break;}
	case '/':
	{int c = a/b;
	System.out.println(c);
	break;}
	case '%':
	{int c = a%b;
	System.out.println(c);
	break;}
	}
}
}