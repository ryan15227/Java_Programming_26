package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        System.out.println(a);

        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "new text";  // word = word + "next text"

        System.out.println(word);

        String old = "mark";
        System.out.println(old.toUpperCase());

        System.out.println(old);


    }
}
