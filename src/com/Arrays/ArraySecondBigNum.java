package com.Arrays;
public class ArraySecondBigNum {

    public static void main(String[] args) {

        int[] a = {45, 57, 8, 7, 25, 66};

        int big = Integer.MIN_VALUE;
        int secondBig = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > big) {
                secondBig = big;
                big = num;
            } else if (num > secondBig && num != big) {
                secondBig = num;
            }
        }

        System.out.println("Second Largest Number: " + secondBig);
    }
}