package com.practiceset.AssignmentOne;

// Ques - Check if two string are anagrams of each other or not.
// Explanation - Two String are said to be anagrams if they contain same characters, only the order can be different

//Method 1- without using any predefined functions

import java.util.Locale;
import java.util.Scanner;

public class StringAnagramsM1 {
    public static boolean isAnagrams(String one, String two){
        char temp;
        char[] a = one.toLowerCase().toCharArray();
        char[] b = two.toLowerCase().toCharArray();
        int count = 0;
        if(a.length != b.length){
            return false;
        }
        else{
            for(int i=0;i<a.length;i++){
                for(int j=0; j<a.length;j++){
                    if(a[j]>a[i]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                    if(b[j]>b[i]){
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
        }
        for (int k=0;k<a.length;k++){
            if(a[k]==b[k]){
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
        boolean result = isAnagrams(inputOne,inputTwo);
        if(result){
            System.out.println("Both String are anagrams");
        }
        else{
            System.out.println("Both String are not anagrams");
        }
    }
}
