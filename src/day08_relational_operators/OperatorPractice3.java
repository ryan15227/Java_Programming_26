package day08_relational_operators;

public class OperatorPractice3 {

    public static void main(String[] args) {

        int h = 5;  // h = 5 -> 6 because of h++
        int p = h; // p gets assigned the value of h, which is 5

        h++;  // doesn't affect the outcome of P because it was already assigned/defined to h which is 5
            // post increment, no other code so it adds 1
        System.out.println(h); //6
        System.out.println(p); //5

        int k = h++; // post increment, get the value first, which is 6 and assigns it to a new variable k, so k has the value of 6. Then h adds 1
        System.out.println("h " + h);
        System.out.println("k " + k);

        int g = ++h; //pre increment, which means it increment 1 right away, then it assigns the value from h to the new variable g

        System.out.println(h);
        System.out.println(g);
    }
}
