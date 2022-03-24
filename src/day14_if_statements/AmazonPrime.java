package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 100;
        boolean hasPrime = true;

        if (hasPrime) {
            System.out.println("2 day shipping");

        } else {

            // here when hasPrime is false

            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping.");


            }

        }
    }
}
 /*
 Task:
       declare and assign a price variable
       declare and assign a boolean - hasPrime variable

       possible outputs:

        prime member: Eligible for 2 day shipping

        not prime and item price is more than or equal to 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99


  */