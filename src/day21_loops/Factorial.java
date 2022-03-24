package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int x = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        // repeated action: multiply the numbers
        // stopping point: when the number gets to 1

        while(x > 1){  // while checks boolean see if its true then it will run until the boolean is false
            System.out.println(result + " * " + x);
            result *= x; // result = result * n
            x--;
        }

        System.out.println(result);

    }
}
