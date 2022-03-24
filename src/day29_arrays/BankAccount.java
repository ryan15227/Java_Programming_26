package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] bankAccountOne = {"Brad Smith", "Checking", "100219482", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account Type: " + bankAccountOne[1]);
        System.out.println("Account Number: " + bankAccountOne[2]);
        System.out.println("Balance: " + bankAccountOne[3]);

        String [] bankAccountTwo = new String [4];  // new String [] <-- the brackets determine how many elements there are
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "James Bong";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "130484192";
        bankAccountTwo[3] = "10203324";
        // bankAccountTwo[20] = ""; out of bounds
        System.out.println(Arrays.toString(bankAccountTwo));

//        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your full name");
//        String fullName = input.nextLine();
//        bankAccountThree[0] = fullName;
//        System.out.println("Enter your account type");
//        bankAccountThree[1] = input.nextLine();
//        System.out.println("Enter your account number");
//        bankAccountThree[2] = input.nextLine();
//        System.out.println("Enter your balance");
//        bankAccountThree[3] = input.nextLine();
//        System.out.println(Arrays.toString(bankAccountThree));

        String [] bankAccountFour = new String[4];
        String [] questions = {"full name", "account type", "account number", "balance"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(bankAccountFour));



    }
}

/*
    0-fullName
    1-accountType
    2-accountNumber
    3-balance

 */