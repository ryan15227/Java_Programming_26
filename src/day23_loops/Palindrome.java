package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "raceca";

        // reverse the String

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){

            reverse += str.charAt(i);  // characters are being read from the end and being added backwards into a reverse String

        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}


/*

    Palindrome: its the same reading from the beginning and the end

    Ex:
        mom
        racecar
        anna
        dad

      Task: Check if a word is palindrome

      flow:
        declare some initial String
        how to reverse a String
        check if the reverse version is the same as the original



 */
