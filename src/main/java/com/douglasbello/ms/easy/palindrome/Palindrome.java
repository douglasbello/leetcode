package com.douglasbello.ms.easy.palindrome;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String y = String.valueOf(x);
        String reversed = "";

        for (int i = 0; i < y.length(); i++) {
            int lastIndex = y.length() -i - 1;

            reversed = reversed.concat(String.valueOf(y.charAt(lastIndex)));
        }

        return reversed.equals(y);
    }
}