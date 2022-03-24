package day20_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next(); // jaMES               // .netLine for more than 1 word
        System.out.println("Please enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase(); //J
        fixedFirst += firstName.substring(1);  //James     //concatenation

        // firstName.charAt(0) --> this will also give you the first character, but as a char type

        String fixedLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);

    }
}

/*
    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase, no extra space

 */
