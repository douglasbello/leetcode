package com.douglasbello.ms;

import com.douglasbello.ms.easy.romantointeger.RomanToInteger;

public class Main {
    public static void main(String[] args) {
        String firstCase = "III";
        String secondCase = "LVIII";
        String thirdCase = "MCMXCIV";
        System.out.println(RomanToInteger.romanToInt(firstCase));
        System.out.println(RomanToInteger.romanToInt(secondCase));
        System.out.println(RomanToInteger.romanToInt(thirdCase));
    }
}