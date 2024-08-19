package com.douglasbello.ms.easy.numberofcandies;

import java.util.ArrayList;
import java.util.List;

public class NumberOfCandies {
    public static List<Boolean> kidsWithCandles(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();

        boolean response = true;
        for (int candy : candies) {
            for (int otherCandies : candies) {
                if (candy == otherCandies) continue;

                if (candy + extraCandies < otherCandies) {
                    response = false;
                    break;
                }

                response = true;
            }

            output.add(response);
        }

        return output;
    }
}