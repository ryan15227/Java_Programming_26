package day28_arrays;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};
        int min = nums[0]; // or min = 1000
        int max = nums[0]; // or max = 0
        for (int i = 0; i < nums.length; i++) {

           // int number = nums[i];

            //(number > max)
            if(nums[i] > max){
                max = nums[i];
            //  (number < min)
            } if(nums[i] < min){
                min = nums[i];
            }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);


    }
}
/*
    declare and assign an array

    500, 120, -80 ,90, 250, -10

    find the biggest number in the array

    find the smallest number in the array
 */
