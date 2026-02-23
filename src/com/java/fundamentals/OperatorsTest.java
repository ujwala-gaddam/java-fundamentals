package com.java.fundamentals;

import java.sql.SQLOutput;

public class OperatorsTest {
    public static void main(String[] args) {
        int no1 =10, no2=20;
        System.out.println(no1+no2);
        System.out.println(no1- no2);
        System.out.println(no1*no2);
        System.out.println(no1/no2);
        System.out.println(no1%no2);
        System.out.println();
        int res = ++no1 - --no2 + no1++ -no2-- + ++no1;
        System.out.println(res);
        System.out.println(no1);
        System.out.println(no2);

        System.out.println(no1+=5);
        System.out.println(no1-=5);
        System.out.println(no1*=5);
        System.out.println(no1/=5);
        System.out.println(no1%5);

        System.out.println(no2+=5);
        System.out.println(no2-=5);
        System.out.println(no2*=5);
        System.out.println(no2/=5);
        System.out.println(no2%5);

    }

}
