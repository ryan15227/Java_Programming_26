package day03_comments_escape_sequence;

public class quotes {

    public static void main(String[] args) {

        System.out.println("i like \"java\" programming");
        System.out.println("\"This is a quote\"");

        /*
        The first quote is before java printing the text
        The second quote is to print the " quotation mark in the console
         */

        //I want to print backslash
        System.out.println("abc\\def");

        /*
            The first backslash is for the syntax of escape characters
            The second backslash is for the backslash character to be output
         */
    }
}
