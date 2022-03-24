package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isPrime = number >= 2; // true when you have valid numbers -> more than 1, otherwise

        /*

         n % 2
         n % 3
         n % 4
         ...
         n % less than number
         */

        // this loop is trying to check if our number is evenly divisible by value from 2 to number

        for(int i = 2; i < number; i++){

            if(number % i == 0){
                isPrime = false;
                break;
            }

        }

        if(isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " not prime");
        }


    }
}

 /*
    [IQ] Prime number [Loops]

    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            11

        Output:
            prime

    Ex:
        Input:
            10

        Output:
            not prime
     */

