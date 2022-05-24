package com.practiceset.AssignmentOne;

import java.util.Arrays;
import java.util.List;

// Ques - Write a program to print the result of sum of square of all the odd numbers in list.
public class SumOfSqOddNumInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbers.stream()
                .filter(n -> n % 2  == 1)
                .map(n  -> n * n)
                .reduce(0, Integer::sum);

        // Answer - 1 + 9 + 25 + 49 + 81 = 165

        System.out.println(sum);
    }
}
