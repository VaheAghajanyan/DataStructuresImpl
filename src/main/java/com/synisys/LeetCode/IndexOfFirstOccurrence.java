package com.synisys.LeetCode;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        System.out.println(firstOccurrence("sadbutsad", "sad"));
        System.out.println(secondSolution("sadbutsad", "but"));
    }

    public static int firstOccurrence(String word, String sym) {
        return word.indexOf(sym);
    }

    public static int secondSolution(String word, String sym) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == sym.charAt(0)) {
                if (word.substring(i, i + sym.length()).equals(sym)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
