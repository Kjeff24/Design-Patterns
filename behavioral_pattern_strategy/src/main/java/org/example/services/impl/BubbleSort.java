package org.example.services.impl;

import org.example.services.SortingStrategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Using Bubble Sort");
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
