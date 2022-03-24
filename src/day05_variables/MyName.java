package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letterOne = 'R';
        char letterTwo = 'y';
        char letterThree = 'a';
        char letterFour = 'n';


        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);

        System.out.println();

        System.out.println("My name: " + letterOne + letterTwo + letterThree + letterFour);

        // or you can make a variable of the name  |
        //                                         v
        String name = "" + letterOne + letterTwo + letterThree + letterFour;
        // the string "NAME" = letterOne-four or Ryan sooooo System.out.println(name);
        System.out.println("My name: " + name);
    }
}
