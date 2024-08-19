package com.cinelits.ms;

import com.cinelits.ms.twosum.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(TwoSum.twoSum(input, target)));
    }
}