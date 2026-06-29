package com.Arrays;

import java.io.IOException;

public class ArraySwitch {
    public static void main(String[] args) throws IOException {
    
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

     
        System.out.print("Enter a character: ");
        char ch = (char) System.in.read();

    
        boolean isVowel = false;

        
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                isVowel = true;
                break; 
            }
        }

        
        if (isVowel) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }
    }
}
