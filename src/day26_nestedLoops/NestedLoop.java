package day26_nestedLoops;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");

        System.out.println("------------------------------------------------  ");
// the below example is nested loop


        // outer loop (loop used to execute the loop below)
        for (int j = 0; j < 3; j++) {   // int j = 1; j <= 3; --> both give 3 executions/iterations


            // inner loop (the loop within the loop) that's why it's called "NESTED" loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe\n");
        }


    }
}
