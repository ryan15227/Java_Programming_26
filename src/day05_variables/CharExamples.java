package day05_variables;

public class CharExamples {

    public static void main(String[] args) {

        //one character at a time in single quotation
        // assigning characters to char type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
        // 0-9 are considered characters
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);

        char letterThree = 65; // char letterThree = 'A'
        System.out.println(letterThree);

        //char letterThree = '65'; this is invalid because there are two characters

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); // original takes all ascii value and adds them 97+90+65+57+36

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne); // spaces between each character

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne); // string in the beginning "char: " so the entire line becomes a string (doesn't do ascii math)
    }
}
