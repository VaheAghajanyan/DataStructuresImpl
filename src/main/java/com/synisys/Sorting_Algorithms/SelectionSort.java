package com.synisys.Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 1, 6, 3, 6, 2, 7};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = min;
            numbers[indexOfMin] = temp;
        }
    }
}
