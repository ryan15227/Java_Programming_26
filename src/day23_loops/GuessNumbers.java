package day23_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 80; // in the future we will learn how to make random numbers
        int guess;

        do {

            System.out.println("Guess a number from 1-100");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println(guess + " is too high");
            } else if(guess < secretNumber){
                System.out.println(guess + " is too low");
            }

        } while(guess != secretNumber); // the loop will continue if you guess wrong, because the guess is not equal to the secret number

        System.out.println("You guessed correct");
    }
}
