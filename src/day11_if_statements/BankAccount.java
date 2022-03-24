package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER ACCOUNT BALANCE");
        double accountBalance = input.nextDouble();  // double accountBalance = 1000();     hard code
        System.out.println("PLEASE ENTER HOW MUCH YOU'D LIKE TO WITHDRAW");
        double withdraw = input.nextDouble();  // double withdraw = 500();     hard code

        // withdraw some amount of money from my balance
        accountBalance -= withdraw;  // balance = balance - withdraw

        if(accountBalance < 0){
            System.out.println("Took too much money, $100 overdraft applied");
            accountBalance -= 100;  // balance = balance - 100;

        }
        System.out.println("Balance $" + accountBalance);





    }
}
/*
Task: Hard code -> Dynamic

    Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

 */