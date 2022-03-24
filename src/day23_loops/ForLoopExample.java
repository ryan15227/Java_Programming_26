package day23_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++ ){

            System.out.println(i);


        }

        /*

        flow of for loop

        1) the loop executes the initialization part to declare and assign a variable

        initialization: int i = 1;

        initialization part runs once in the beginning

        2) boolean condition / termination condition

            -> if the boolean is true: the loop will execute the statements

            -> if the boolean is false: the loop will stop

            in our example: 1 <= 10
        3) the statements in the code body are executed from top to bottom

            in our example: System.out.println(i);

        4) update happens - this is the  end of the iteration

            in our ex: i++

        5) goes back to step 2 and repeats



         */

    }
}
