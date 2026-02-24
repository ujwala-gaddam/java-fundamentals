package com.java.problems.loops;

import java.util.Scanner;
// Find the given number is even or odd
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println(num +" is even");
        }else {
            System.out.println(num + " is odd");
        }

    }
}
