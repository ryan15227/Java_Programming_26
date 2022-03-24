package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "today is monday, we learned String methods";
        String [] words = str.split(" ");

        String reversed = "";

        for(int i = words.length - 1; i >= 0; i--){
            reversed += words[i] + " ";
        }
        System.out.println(reversed.trim());

    }
}

    /*
        Given a sentence
            today is monday

        reverse the sentence
     */
