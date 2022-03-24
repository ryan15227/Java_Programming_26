package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcde";
                //  01234

        int mid = s.length() / 2;

        if(s.length() % 2 == 0){
            // our word is even length

            // length / 2 => 6 / 2 = 3

            char firstMiddle = s.charAt(mid - 1);
            char secondMiddle = s.charAt(1);
        } else {
            // our word is odd length

            char middle = s.charAt(mid);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(s.length() / 2, s.length()/2 + 1));
        }

        // length / 2: 5/2 == 2
        //abcdefg
        //0123456

        // 7/2 = 3
    }
}
