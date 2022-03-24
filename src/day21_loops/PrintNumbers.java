package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int x = 2;

        while(x <= 100){
            System.out.println(x);
            x += 2;
        }

        // approach 2:

        int y = 1;

        while(y <=  100){
            if(y % 2 == 0){
                System.out.println(y);
            }
            y++;
        }

        System.out.println();

        // odd numbers

        int a = 1;

        while(a <= 100){
            System.out.print(a + " ");
            a += 2;
        }

        System.out.println();
        // approach 2

        int b = 0;

        while(b++ <= 100){
            if(b % 2 ==1){
                System.out.print(b + " ");
            }
        }

        /*
            flow:
            b = 0
            b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
            if(b % 2 == 1) --> & 2 == 1 --> true -> prints number

            while(b++ <= 100) --> loops runs and b increments to 2
            if(b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

         */

    }
}

    /*

        print all the even numbers form 1 to 100

        print all the odd numbers from 1 to 100, but all in one line with spaces between eachother
     */