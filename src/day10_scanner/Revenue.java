package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price: ");
        double price = input.nextDouble();
        System.out.println("Please enter the quantity: ");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("Revenue: $" + revenue);

    }
}

/*
Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price x quantity
 */