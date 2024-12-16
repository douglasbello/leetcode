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

    public static int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (i != s.length() - 1) {
                String nextChar = String.valueOf(s.charAt(i + 1));

                if (currentChar.equals("I") && (nextChar.equals("V") || nextChar.equals("X"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
                    i++;
                    continue;
                }

                if (currentChar.equals("X") && (nextChar.equals("L") || nextChar.equals("C"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
                    i++;
                    continue;
                }

                if (currentChar.equals("C") && (nextChar.equals("D") || nextChar.equals("M"))) {
                    number += (conversions.get(nextChar) - conversions.get(currentChar));
                    i++;
                    continue;
                }
            }

            number += conversions.get(currentChar);
        }

        return number;
    }
}