package com.Arrays;

import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
      
        int[] a = {3, 5, 63, 22, 5, 63, 7, 11};

       
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            boolean isPrime = true;


            if (num <= 1) {
                isPrime = false;
            } else {

                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false; 
                        break;           
                    }
                }
            }

            
            if (isPrime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}
