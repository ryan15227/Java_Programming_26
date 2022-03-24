package day25_recap;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" "); // could have done str.indexOf(" ", firstSpace + 1);

        String middleWord = str.substring(firstSpace + 1, lastSpace);
        String reverse = "";

        for(int i = middleWord.length() - 1; i >= 0; i--){
            reverse += middleWord.charAt(i);
        }
        System.out.println(str.substring(0, firstSpace) + " " + reverse + str.substring(lastSpace));

        // str.replace(middleWord, reverse)
        // System.out.println(str);

    }
}

/*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String

    Ex:
    I love java
 */
