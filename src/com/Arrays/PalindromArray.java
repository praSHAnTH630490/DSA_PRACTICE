package com.Arrays;
import java.util.*;
public class PalindromArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        char[] n = line.toLowerCase().toCharArray();
        
          boolean isPalindrome = true;
          int start = 0;
          int end = n.length - 1;
  
          while (start < end) {
              if (n[start] != n[end]) {
                  isPalindrome = false; 
                  break; 
              }
              start++; 
              end--;   
          }
          if (isPalindrome) {
              System.out.println(line+ " is a palindrome.");
          } else {
              System.out.println(line+ " is NOT a palindrome.");
          }
        }
        }
