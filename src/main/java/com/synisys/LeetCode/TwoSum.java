package com.synisys.LeetCode;

import java.util.*;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{3, 3}, 6);

    }
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null)
            return null;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int missing = target - current;

            if (map.containsKey(missing) && map.get(missing) != i) {
                System.out.println(i + ":" + map.get(missing));
                return new int[]{i, map.get(missing)};
            }
        }

        return null;
    }
}
