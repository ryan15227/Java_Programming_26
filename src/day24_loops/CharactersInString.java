package day24_loops;

public class CharactersInString {
    public static void main(String[] args) {

        String s = "java";

        for(int i = 0; i < s.length(); i++){

            System.out.print((int)s.charAt(i) + " ");  //if you turn/CAST a string to int you turn it to ascii value

        }


    }
}

    /*
    Characters in String
        Given a String print the ascii value codes for each character
     */
