package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        int [] arr1 = {45, 123, 62};
        int newElement = 100;

        int [] arr2 = Arrays.copyOf(arr1, arr1.length + 1);
        arr2[arr1.length] = newElement;
        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("New Array: " + Arrays.toString(arr2));

        System.out.println("_____________________________________");

        Scanner input = new Scanner(System.in);
        // Ask how many numbers start with
        System.out.println("How many numbers do you want to start with");
        int size = input.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {

            System.out.println("Enter a number");
            nums[i] = input.nextInt();



        }

        System.out.println("Array so far: " + Arrays.toString(nums));
        int [] expanded = Arrays.copyOf(nums, nums.length + 1);

        System.out.println("Enter the last number");
        expanded[expanded.length - 1] = input.nextInt();
        System.out.println(Arrays.toString(expanded));

        /*

        Have a starting array
        you want to add a number to the end
        so make your array bigger to store the new number

        Ex:
            {45, 123, 62}
            adding 100
            {45, 123, 62, 100}





         */



    }
}
