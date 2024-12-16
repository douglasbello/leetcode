package com.douglasbello.ms.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static Map<String, Integer> conversions = new HashMap<>();

    static {
        conversions.put("I", 1);
        conversions.put("V", 5);
        conversions.put("X", 10);
        conversions.put("L", 50);
        conversions.put("C", 100);
        conversions.put("D", 500);
        conversions.put("M", 1000);
    }

    // III
    // LVIII
    // MCMXCIV

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
    public static int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (i != s.length() - 1) {
                String nextChar = String.valueOf(s.charAt(i + 1));

                if (currentChar.equals("I") && (nextChar.equals("V") || nextChar.equals("X"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
                    s.substring(i + 1);
//                    System.out.println(conversions.get(currentChar));
//                    System.out.println(conversions.get(nextChar));
                    System.out.println(conversions.get(nextChar) - conversions.get(currentChar));
                    continue;
                }

                if (currentChar.equals("X") && (nextChar.equals("L") || nextChar.equals("C"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
//                    System.out.println(conversions.get(currentChar));
//                    System.out.println(conversions.get(nextChar));
                    System.out.println(conversions.get(nextChar) - conversions.get(currentChar));
                    s.substring(i + 1);
                    continue;
                }

                if (currentChar.equals("C") && (nextChar.equals("D") || nextChar.equals("M"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
                    System.out.println(conversions.get(currentChar));
                    System.out.println(conversions.get(nextChar));
//                    System.out.println(conversions.get(nextChar) - conversions.get(currentChar));
                    s.substring(i + 1);
                    continue;
                }
            }

            number += conversions.get(currentChar);
            System.out.println(number);
        }

        return number;
    }
}