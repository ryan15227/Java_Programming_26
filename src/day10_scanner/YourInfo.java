package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite book? ");
        String book = in.nextLine();
        System.out.print("What is your age? ");
        byte age = in.nextByte();
        System.out.print("What is your favorite number? ");
        long favoriteNumber = in.nextLong();


    }
}
 /*
 Ask the user to enter their age (byte),
 ask them to enter their favorite number (long),
 and ask them to enter their favorite book
 Print all the values from all the inputs
  */