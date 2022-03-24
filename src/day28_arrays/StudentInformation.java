package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] studentOne = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));  //Arrays.toString prints the entire [] string

        String [] studentTwo = new String[4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo[0] = "010";
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "26";
        System.out.println(Arrays.toString(studentTwo));

        String [] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id");
        studentThree[0] = input.nextLine();
        System.out.println("Please enter your first name: ");
        studentThree[1] = input.nextLine();
        System.out.println("Please enter your last name: ");
        studentThree[2] = input.nextLine();
        System.out.println("Please enter your batch number: ");
        studentThree[3] = input.nextLine();
        System.out.println(Arrays.toString(studentThree));

        String [] studentFour = new String[4];
        String [] questions = {"Enter your id", "Enter your first name", "Enter your last name", "Enter your batch number"};

        for (int i = 0; i < 4; i++) {
            System.out.println(questions[i]); // reading each element of the questions array
            studentFour[i] = input.nextLine(); // assigning the Scanner input into our studentFour array
        }
        System.out.println(Arrays.toString(studentFour));


    }
}

/*

    all string types
    0 -> id
    1 -> First name
    2 -> Last Name
    3 -> Batch number



 */
