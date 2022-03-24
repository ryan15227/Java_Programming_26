package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTvs = 100;

        System.out.println("Person comes into the store and they bought a TV.");
        System.out.println("Number of TV's now: " + --numberOfTvs);

        System.out.println("Person comes into the store and they bought a TV.");
        System.out.println("Number of TV's now: " + --numberOfTvs);

        System.out.println("Person comes into the store and the put TV into their cart.");
        System.out.println("Number of TV's in the store: " + numberOfTvs--);
        System.out.println("Person bought it, now I have: " + numberOfTvs);

        System.out.println("I get a shipment");
        numberOfTvs = numberOfTvs + 13;

        System.out.println("TV's in stock: " + numberOfTvs);





    }
}
