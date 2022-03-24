package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0);

        System.out.println(isLeapYear);




    }
}

/*
ask the user to enter a year. determine if the year is a leap year or not. you can assume a leap year is a year that is divisible by 4, or divisible by 100 but not 400. Print true or false
 */