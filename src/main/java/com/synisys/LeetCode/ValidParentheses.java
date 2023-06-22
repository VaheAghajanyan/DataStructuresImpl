package com.synisys.LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(("));
        System.out.println(isValid("){"));
    }

    public static boolean isValid(String str) {
        if (str.length() < 2) {
            return false;
        }

        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(") || arr[i].equals("{") || arr[i].equals("[")) {
                stack.push(arr[i]);
            } else {
                switch (arr[i]) {
                    case ")": {
                        if (!stack.isEmpty() && stack.peek().equals("("))
                            stack.pop();
                        break;
                    }
                    case "}": {
                        if (!stack.isEmpty() && stack.peek().equals("{"))
                            stack.pop();
                        break;
                    }
                    case "]": {
                        if (!stack.isEmpty() && stack.peek().equals("[")) {
                            stack.pop();
                            break;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
