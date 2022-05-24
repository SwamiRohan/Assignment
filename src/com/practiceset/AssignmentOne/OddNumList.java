package com.practiceset.AssignmentOne;

//Ques - To print odd number of the list.

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> oddNumList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of List");
        int n = sc.nextInt();
        System.out.println("Enter elements in the List");
        for(int i=0; i<n; i++){
            numList.add(sc.nextInt());
        }
        for(int a: numList){
            if(a%2 != 0){
                oddNumList.add(a);
            }
        }
        System.out.println("Odd Number elements in the List are: ");
        oddNumList.forEach(System.out::println);
    }
}
