package com.Arrays;
import java.util.*;

public class PrimeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc .next();
		char[] ch = line.toLowerCase().toCharArray();
		int start = 0;
		int end = ch.length-1;
		boolean isPali = true;
		
		while (start < end ) {
			if(ch[start]!=ch[end]) {
				isPali = false;
				break;
			}
			start++;
			end--;
		}
		if(isPali) {
			System.out.println(line+"is palindrom");
			
		}
		else {
			System.out.println(line+"is not palindrom");
		}
}
}