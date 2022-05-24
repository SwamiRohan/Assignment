package com.practiceset.AssignmentOne;

import java.util.Arrays;
import java.util.List;

// Ques - Write a program to print square of odd number in the list

public class PrintSqOfOddNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .filter(n -> n % 2  == 1)
                .map(n  -> n * n)
                .forEach(System.out::println);

        // Answer - 1, 9, 25, 49, 81
    }
}
