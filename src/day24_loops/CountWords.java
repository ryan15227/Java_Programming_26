package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for (int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ' '){   // str.substring(i , i + 1).equals(" ")
                // don't use " " because you're using a char type if you use quotations it will turn to string and wont work
                spaces++;
            }
        }
        System.out.println("Number of words: " + (spaces + 1));
    }
}

    /*

        count words
        Given a sentence determine how many words are in the String.
        Ex:
        Input:
        This has multiple words
        Output:
        4
     */