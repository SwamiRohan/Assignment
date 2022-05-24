package com.practiceset.AssignmentOne;

// Ques - Check if two string are anagrams of each other or not.
// Explanation - Two String are said to be anagrams if they contain same characters, only the order can be different

//Method 2 - using predefined functions

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramM2 {
    public static boolean isAnagram(String one, String two) {
        char[] a = one.toLowerCase().toCharArray();
        char[] b = two.toLowerCase().toCharArray();
        int count = 0;
        if (a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length;i++){
            if(a[i] == b[i]){
                ++count;
            }
        }
        if(a.length == count){
            return true;
        }
        else    return false;
    }
    public static void main(String[] args) {
        String inputOne;
        String inputTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        inputOne = sc.nextLine();
        System.out.println("Enter second String");
        inputTwo = sc.nextLine();
        boolean result = isAnagram(inputOne,inputTwo);
        if(result){
            System.out.println("Both String are anagrams");
        }
        else{
            System.out.println("Both String are not anagrams");
        }
    }
}
