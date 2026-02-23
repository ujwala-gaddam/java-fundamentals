package com.java.fundamentals;

import java.util.Scanner;

public class Customerbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter productId:");
        byte productid = scanner.nextByte();//
        System.out.println("Enter name");
        String productName = scanner.next();
        System.out.println("Enter Price");
        int Price = scanner.nextInt();
        System.out.println("Enter discount");
        float discount= scanner.nextFloat();
        System.out.println("Enter discountAmount");
        float discountAmount=(Price*discount)/100;
        double stateTax = Price * 0.025;
        double centraltax = Price * 0.025;
        double finalPrice = Price + stateTax +centraltax;
        
    }
}
