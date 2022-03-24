package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username: ");
        String username = input.nextLine();
        username = username.toLowerCase();

        System.out.println("Please enter a password: ");
        String password = input.nextLine();

        if(password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + username);
        } else {
            System.out.println("Invalid password");
        }


    }
}

    /*

        Ask the user to enter a username
        make sure the username is lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"

        -> if the entered password is matches the system password

            otherwise print:

            invalid password

     */