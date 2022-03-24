package day09_scanner;

import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println(number);



    }


}
 /*

Scanner is a CLASS that has METHODS that allow us to get input values from the console

classes are java files

methods are a block of code that is ready to use

Why do we use Scanner?
    To avoid hard coded information, we want to use/get information from outside of code

How can you use Scanner

    1) import the class

        allow us to use a different class/file that are in different packages

        for Scanner: import java.util.Scanner;

      -> imports go between the package and class
            PIC: package, import, class

      -> you must import to use Scanner

    2)   creating the Scanner object(variable)

         object allows us to use the methods

         syntax:

            Scanner input = new Scanner(System.in);
    3)  use the methods

         to use the actions that are defined we can use Scanner method with the objec we made
         ( step 2 )

            general syntax:
                nameOfScanner




  */