package day09_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Hit enter after each\n");
        System.out.println("Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Number 2: ");
        int num2 = input.nextInt();
        System.out.println("Number 3: ");
        int num3 = input.nextInt();
        System.out.println("The sum is: " + (num1 + num2 + num3));
    }
}

/*
    create Scanner object
    ask the user to enter 3 numbers
    find and print the sum of the numbers
 */