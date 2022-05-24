package com.practiceset.AssignmentOne;

import java.util.Scanner;

// Ques - Write a program to check if entered year is leap year or not.
// Explanation - Year which have 366 days is Known as leap year.
// Logic - Century year(ending with 00) should be divisible by 4, 100, 400 and non century year should only
//         be divisible by 4.

public class LeapYear {
    public static boolean checkLeapYear(int year){
        boolean result;
        if(year%4 == 0){
            result = true;
            if (year%100 == 0){
                if (year%400 == 0){
                    result = true;
                }
                else    result=false;
            }
        }
        else    result = false;
        return result;
    }
    public static void main(String[] args) {
    int year;
    boolean isLeapYear;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year :");
    year = sc.nextInt();

    isLeapYear = checkLeapYear(year);
    if(isLeapYear){
        System.out.println("Entered year is Leap Year");
    }
    else System.out.println("Entered year is not Leap year");
    sc.close();
    }
}
