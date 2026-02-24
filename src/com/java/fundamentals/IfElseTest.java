package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter Num1");
        int num1 = sc.nextInt();
        System.out.println("enter Num2");
        int num2 = sc.nextInt();
        System.out.println("enter Num3");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1>num3){
            System.out.println(num1 +"is greater");
        } else if (num2 >num3 && num2>num1) {
            System.out.println(num2 + "is greater" );
        } else if(num3>num1&&num3>num2){
            System.out.println(num3 + "is greater");
        }else{
            System.out.println( "both are equal");
        }

    }
}
