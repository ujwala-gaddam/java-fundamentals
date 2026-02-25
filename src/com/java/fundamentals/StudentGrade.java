package com.java.fundamentals;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("subject1");
        int subject1 = sc.nextInt();
        System.out.println("subject2");
        int subject2 = sc.nextInt();
        System.out.println("subject3");
        int subject3 = sc.nextInt();
        System.out.println("subject4");
        int subject4 = sc.nextInt();
        System.out.println("subject5");
        int subject5 = sc.nextInt();
        int totalMarks = (subject1 + subject2 + subject3 + subject4 + subject5);
        int avgMarks= totalMarks/5;
        if(avgMarks>80){
            System.out.println("Student Grade is A");
        } else if (avgMarks >=70) {
            System.out.println("Student Grade is B");
        } else if (avgMarks>=60) {
            System.out.println("Student Grade is C");
        } else if (avgMarks>=50) {
            System.out.println("Student Grade is D");
        } else if (avgMarks>=40) {
            System.out.println("Student Grade is E");
        } else
            System.out.println("Student is fail ");
    }
}
