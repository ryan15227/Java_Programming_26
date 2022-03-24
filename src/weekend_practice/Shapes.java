package weekend_practice;

public class Shapes {
    public static void main(String[] args) {

        String str = "**********";
        
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }

        
    }

}
/*
Nested Loop Practice
------------------------------------------------------------
Print this shape:

         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *

------------------------------------------------------------

Print this shape:

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *

------------------------------------------------------------
 */
