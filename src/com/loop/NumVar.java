package com.loop;

public class NumVar {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 3; i++) {

            // Leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = i; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}


