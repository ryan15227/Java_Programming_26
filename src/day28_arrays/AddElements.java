package day28_arrays;

public class AddElements {
    public static void main(String[] args) {

        int [] numbers = {3, 6, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
/*

    declare and assign an array of numbers
    sum all the numbers in the array

 */