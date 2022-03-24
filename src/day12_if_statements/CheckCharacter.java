package day12_if_statements;


public class CheckCharacter {
    public static void main(String[] args) {

        char letter = '9';

                // can use ascii values
        if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter);
            System.out.println("lowercase");
        }
        if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter);
            System.out.println("UPPERCASE");
        }
    }
}
  /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
     */