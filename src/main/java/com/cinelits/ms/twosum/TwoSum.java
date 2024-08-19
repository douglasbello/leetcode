package com.cinelits.ms.twosum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}