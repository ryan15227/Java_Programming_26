package day29_arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int [] nums = {10, 0, 5, 0, 1, 0};
        int [] fixed = new int[nums.length];
        int index = 0;  // variable to keep track of the fixed array

//        for (int i = 0; i < nums.length; i++) {
//
//            if(nums[i] != 0){
//                fixed[index++] = nums[i]; // reading the element at position i of the nums array and storing it into the fixed array and position index. after storing the value index variable is incremented by 1
//            }
//        }

        for(int each : nums){
            if(each != 0){
                fixed[index++] = each;
               // index++; look at line 21

            }
        }

        System.out.println(Arrays.toString(fixed));

    }
}
