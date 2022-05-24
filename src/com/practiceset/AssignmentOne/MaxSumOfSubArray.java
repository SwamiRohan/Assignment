package com.practiceset.AssignmentOne;

import java.util.Scanner;
// Ques - Maximum SubArray sum.
// Explanation - if array ={1,2,3} than subarray will  be {1},{2},{3},{4}; {1,2},{1,3},{2,3}, {1,2,3}

public class MaxSumOfSubArray {
    public static int maxSubArraySum(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arraySize;
        arraySize = sc.nextInt();
        int a[] = new int[arraySize];
        System.out.println("Enter elements of array");
        for(int i =0; i<arraySize; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("\nSum is: "+maxSubArraySum(a));
    }
}
