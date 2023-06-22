package com.synisys.LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s  = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(s));
    }

    public static boolean isPalindrome1(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int head = 0, tail = s.length() - 1;

        while (head < tail) {
            if (s.charAt(head++) != s.charAt(tail--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        if (s.length() == 0) {
            return true;
        }

        String str = "";
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str = str + c;
            }
        }

        int head = 0, tail = str.length() - 1;
        while (head < tail) {
            if (str.charAt(head++) != str.charAt(tail--)) {
                return false;
            }
        }

        return true;
    }
}
