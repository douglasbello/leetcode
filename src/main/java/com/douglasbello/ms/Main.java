package com.douglasbello.ms;

import com.douglasbello.ms.easy.numberofcandies.NumberOfCandies;

public class Main {
    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;

        System.out.println(NumberOfCandies.kidsWithCandles(candies, extraCandies));
    }
}