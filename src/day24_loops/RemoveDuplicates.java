package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String s = "abcabc";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(!unique.contains("" + s.charAt(i)))
                unique += s.charAt(i);
        }
        System.out.println(unique);

    }

}
    /*

        String s = "abcabc";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(!unique.contains("" + s.charAt(i)))
                unique += s.charAt(i);
        }

        iteration 1:
        i = 0
        charAt(i) --> charAt(0) --> a
        unique = "";


             if(!unique.contains("a")){ unique.contains("a") --
                unique += s.charAt(i);
    }
     */

