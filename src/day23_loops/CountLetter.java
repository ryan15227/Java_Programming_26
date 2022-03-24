package day23_loops;

public class CountLetter {
    public static void main(String[] args) {

        String word = "banana";

        int count = 0;

        for(int i = 0; i < word.length(); i++){

            if(word.charAt(i) == 'a'){
                count++;

            }

        }

        System.out.println(count);

    }
}

    /*

        Given a String we want to count how many 'a' characters we have

        challenge: adjust so that we can check for not only 'a' but any character

     */