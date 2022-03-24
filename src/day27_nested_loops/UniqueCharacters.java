package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCDEEF";
        for (int i = 0; i < str.length(); i++) {

            char letter =  str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char inner = str.charAt(j);

                //System.out.println(letter + " - " + inner);

                if(letter == inner){
                    count++;
                }
            }

            if(count == 1){ // the counter will be one when the character was unique. the character will always match itself one time, so it will never be 0, but if the counter value is more than 1 then that character matched with multiple characters, which means it is not unique
                System.out.print(letter);
            }
            //System.out.println(letter + " - " + count);

        }
    }
}

  /*
    [Interview Question] Unique characters

    Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            BDF

        -> the characters B D and F are only found in the String once so they are unique

     */
