package Practice_from_videos;

public class UnaryOperators {
    public static void main(String[] args) {

        //Positive and Negative (+ , -)
        int a = -100;
        int b = +200;

        boolean aIsNegative = a < 0;
        boolean bIsPositive = b > 0;

        System.out.println(aIsNegative);
        System.out.println(bIsPositive);


        // Increment and Decrement (++ , --)  ++ add one and -- decreases by one
        int x = 10; //11
        System.out.println(++x); //11
        System.out.println(--x); //10


        int z = 20;
        System.out.println(z++); //20 (current value of z) post increment
        System.out.println(z);

        int q = 100;
        System.out.println(q--); //100 post decrement  so the next value q would be 99
        System.out.println(q);



    }
}

/*
Unary Operators:

    + (plus) positive number
    - (minus) negative number
    ++ incrementing, adding 1
    -- decrement, subtracting 1

    int num = 0

    pre-increment: increment the value before the rest of the statement is run

        ++num

    post-decrement: decrements the value before the rest pf the statement is run

        --num

    post-increment: increments the value after the statement is run


        num++

    post-decrement: decrements the value after the statement is run

        num--*
 */
