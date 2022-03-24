package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER THREE DIFFERENT VALUES ! USE ENTER AFTER EACH !");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // int num1 = 10;
        // int num2 = 20;      hardcode
        // int num3 = 30;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " IS THE BIGGEST");
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " IS THE BIGGEST");
        } else {
            System.out.println(num3 + " IS THE BIGGEST");
        }

    }
}

/*

    declare and assign 3 int variables
    between the 3 numbers find and print the biggest one

 */