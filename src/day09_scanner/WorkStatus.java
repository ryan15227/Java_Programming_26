package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = input.next();
        System.out.println("Last name: ");
        String lastName = input.next();
        System.out.println("Are you employed? ");
        boolean amEmployed = input.nextBoolean();
        System.out.println("Are you a student? ");
        boolean amStudent = input.nextBoolean();



    }




}

/*
    Task

    create Scanner object
    ask the user to enter their first name
    ask the user to enter their last name
    ask the user if they are employed
    ask the user if they are a student
 */