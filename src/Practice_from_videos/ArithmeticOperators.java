package Practice_from_videos;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(1000 + 2000);
        System.out.println(2.5 + 3.5);

        System.out.println(100-30);
        int a = 300 -100 ;
        System.out.println(a);


        System.out.println(20*6);
        System.out.println(5.5*7);


        System.out.println(10/4);  //2
        System.out.println(10.0/4); //2.5 result is a decimal because one of the numbers is a decimal
        System.out.println(10/4.0); //2.5
        System.out.println(10.0/4.0); //2.5

        System.out.println(20/6);  //3.33.... only get 3 no decimal
        System.out.println(20d/6); //3.33..... is the result because i assigned 20 to be a decimal (20d)

        System.out.println( 10%4 );

        System.out.println();


    }
}

/*
    +: Addition
    -: Subtraction
    *: Multiplication
    /: Division
    %: Remainder

        Remainder in math:
        in Math:
            10 / 4 = 2.5;

            remainder: numerator - (denominator * integer result)
                           10    -  ( 4 * 2 )
                           10    - 8
                           2

            20/6 = 3.333...

            remainder: 20 - ( 6 * 3 )
                       20 - 18
                       2
 */