package com.java.fundamentals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("subject1");
        int num1 = sc.nextInt();
        System.out.println("subject2");
        int num2 = sc.nextInt();
        System.out.println("subject3");
        int num3 = sc.nextInt();
        System.out.println("subject4");
        int num4 = sc.nextInt();
        System.out.println("subject5");
        int num5 = sc.nextInt();
        int totalMarks = (num1 + num2 + num3 + num4 + num5)/5;
        int avgMarks= totalMarks/5;

        switch (avgMarks) {


            case 1:
                if (avgMarks >= 81) {
                    System.out.println("Grade: A");
                }
                break;

            case 2:
                if (avgMarks >= 71 && avgMarks <= 80) {
                    System.out.println("Grade: B");
                }
                break;

            case 3:
                if (avgMarks >= 61 && avgMarks <= 70) {
                    System.out.println("Grade: C");
                }
                break;

            case 4:
                if (avgMarks >= 50 && avgMarks <= 60) {
                    System.out.println("Grade: D");
                }
                break;

            default:
                if (avgMarks < 50) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Invalid Input");
                }
        }


    }
}
