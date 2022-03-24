package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angleThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("is a triangle: " + isTriangle);
        System.out.println("is a circle: " + isCircle);


    }
}
 /*
 Write a program that asks the user to enter 3 angle numbers (can be floating numbers)
 Determine if the angles make a triangle, which means the angles add up to 180 degrees
 Determine if the angles make a circle, which means the angles add up to 360 degrees
  */