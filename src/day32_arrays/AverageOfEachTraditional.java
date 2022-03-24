package day32_arrays;

import java.util.Arrays;

public class AverageOfEachTraditional {
    public static void main(String[] args) {

        int [][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,20,39}
        };

        double total = 0;
        int totalLength = 0;

        for(int i = 0; i < nums.length; i++){ // going through the 2d array

            double sum = 0;

            for(int j = 0; j < nums[i].length; i++){
                sum += nums[i][j];

            }
            System.out.println(Arrays.toString(nums[i]) + " the average is: " + (sum/ nums[i].length));
            total += sum;
            totalLength += nums[i].length;

        }
        System.out.println("Average of the whole 2D array: " + (total/totalLength));

        /*
                         int [][] nums = {
                        {3,4,5,6},
                        {5,2,6},
                        {10,20,39}
                };

            int i = 0

                int j = 0;
                nums[i][j]
                nums[0][0] --> 3
                j = 1
                nums[0][1] --> 4
                j = 2
                nums[0][2] -->5
                j = 3
                nums[0][3] --> 6

                i = 1

                int j = 0;
                nums[i][j]
                nums[1][0] --> 3
                j = 1
                nums[1][1] --> 4
                j = 2
                nums[1][2] -->5
                j = 3
                nums[1][3] --> 6





         */

        /*

        Given a 2D array find the average of each inner array
        and extra: average of the whole array

        Ex:

            3, 4, 5, 6
            5, 2, 6
            10, 20, 30

         */
    }

}
