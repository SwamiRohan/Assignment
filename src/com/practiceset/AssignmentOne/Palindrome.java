package com.practiceset.AssignmentOne;

import java.util.Scanner;

// Ques - To check if entered input is Palindrome or not
// Explanation -> Palindrome means if we read the input from backwards(by reversing it) it should be same as forward
//                Like aba is palindrome while abb is not palindrome

public class Palindrome {
    public static void main(String args[]){
        String checkInput = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        String inputString = sc.nextLine();
        int length = inputString.length();
        for(int i = length-1; i>=0; i--){
            checkInput = checkInput + inputString.charAt(i);
        }
        if(inputString.equals(checkInput)){
            System.out.println("Entered Input: '"+inputString+"' is Palindrome " );
        }
        else
            System.out.println("Entered Input: '"+inputString+"' is not Palindrome ");
        sc.close();
    }
}
