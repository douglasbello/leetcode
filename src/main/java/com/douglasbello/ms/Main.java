package com.douglasbello.ms;

import com.douglasbello.ms.easy.romantointeger.RomanToInteger;

public class Main {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(RomanToInteger.romanToInt(roman));
//        String roman = "III";
//        System.out.println(roman.length());
//        for (int i = 0; i < roman.length(); i++) {
//            System.out.println("i = " + (i - 1));
//        }
    }
}