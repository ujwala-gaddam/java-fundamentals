package com.java.fundamentals;
import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter productId:");
        byte productid = scanner.nextByte();//
        System.out.println("Enter name");
        String productName = scanner.next();
        System.out.println("Enter manufacturedYear");
        Short manufactured_year = scanner.nextShort();
        System.out.println("Enter maxRetailPrice");
        int maxRetailPrice = scanner.nextInt();
        System.out.println("Enter discountPercentage");
        float discountPercentage= scanner.nextFloat();
        System.out.println("finalPrice");
        double finalPrice = scanner.nextDouble();
        System.out.println("Enter category");
        char category =scanner.next().charAt(0);
        System.out.println("is product Avaliabe(true/false");
        boolean productAvaliable = scanner.nextBoolean();
        System.out.println();









    }
}
