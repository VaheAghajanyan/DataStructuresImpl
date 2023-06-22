package com.synisys.LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String[] arr2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix(arr2));
    }

    public static String longestCommonPrefix(String[] arr) {
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
