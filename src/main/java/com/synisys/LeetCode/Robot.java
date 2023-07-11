package com.synisys.LeetCode;

public class Robot {
    public static void main(String[] args) {
    }

    public static void findSteps(int n) {
        int x = 0, y = 0;

        for (int i = 1; i <+ n; i++) {
            if (isPair(i)) {
                x += i;
                y += i;
            } else {
                x -= i;
                y -= i;
            }
        }
        System.out.println("X: " + x + "\nY: " + y);
    }

    public static boolean isPair(int num) {
        return num % 2 == 0;
    }
}
