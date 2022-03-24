package day14_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\nPlease insert you card and then your pin-code");
        int pincode = input.nextInt();

        int expectedPin = 2342;

        if(pincode == expectedPin){

            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("1)Check Balance");
            System.out.println("2)Withdraw");
            System.out.println("3)Deposit");
            int option = input.nextInt();

            if(option == 1){
                System.out.println("Your balance is $: " + 10_000_000);
            } else if(option == 2){
                System.out.println("How much would you like to withdraw?");
                double money = input.nextDouble();
                System.out.println("Withdrawing " + money);
            } else if(option == 3){
                System.out.println("Please deposit the money");
            } else {
                System.out.println("Invalid selection. Exiting account");
            }


        } else {
            System.out.println("Invalid pin. Please try again");
        }
    }
}
