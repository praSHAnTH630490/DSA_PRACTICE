package com.loop;
import java.util.Scanner;

public class ArmstronNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            int temp = n;
            int sum = 0;

            for (;temp > 0;) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.println(sum);
            }
        }

        sc.close();
    }
}