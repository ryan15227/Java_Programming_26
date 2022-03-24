package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -100000000;
        int min = 100000000;

        int iterations = 0;

        while(iterations < 5){
            iterations++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

/*
Write a program that asks the user to enter 5 numbers and returns the biggest and smalled numbers from those 5


    repeated steps:

        ask for a number

        check is it the biggest

        check is it the smallest

 */