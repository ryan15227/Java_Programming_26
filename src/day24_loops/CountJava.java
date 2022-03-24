package day24_loops;

public class CountJava {
    public static void main(String[] args) {

        String s = "java is a java language.java";
        int counter = 0;

        for(int i = 0; i < s.length() - 3; i++){

            String everyFour = s.substring(i, i + 4);
            System.out.println(everyFour);
            if(everyFour.equals("java")){
                counter++;
            }

        }

        System.out.println(counter);

        /*

            we did substring( i , i + 4) to read every four characters in the String

            doing i + 4 causes the program to go out of bounds

            so to fix it we tried i < s.length() - 4
            but -4 skipped the last 4 characters in the String

            so either you had to do:
                i <= s.length() - 4
                or
                i < s.length() -3

         because the second number in substring is not included in the result

         */

    }


}


/*

    java is a language
    01234

    java 0, 4
    ava  1, 5
    va i 2, 6


 */