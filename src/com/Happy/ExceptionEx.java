package com.Happy;

import java.io.IOException;

public class ExceptionEx {
public static void display() throws ArithmeticException,IOException {
			
				int a = 34;
				int b = 0;
				System.out.println(a/b);	
		}
	public static void main(String[] args) {
	try {
		ExceptionEx.display();
	} catch (ArithmeticException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		System.out.println("");
	}
	}

}
