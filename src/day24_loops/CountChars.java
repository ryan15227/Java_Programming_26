package day24_loops;

public class CountChars {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);  // get the character at the index number 'i' for this iteration, and stores into the variable letter for re-usability

            if(letter >= 'A' && letter <= 'Z'){
                upper++;
            } else if(letter >= 'a' && letter <= 'z'){
                lower++;
            } else if(letter >= '0' & letter >= '9'){
                number++;
            }

        }


        // the purpose of the loop was to check every character and see if it is uppercase, lowercase, or a number. We want the loop to finish which means every character was checked. Then we will print one time after the loop the results

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);


    }
}

/*
        Count upper, lower and numbers
            Given a String, find and print how many uppercase letters, lowercase letters and n umber are in the String

            Ex:
            input: 2juMp41EEkd4s4

            output:
            3 uppercase letters
            6 lowercase letters
            5 numbers

 */