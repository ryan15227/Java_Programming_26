package Practice_from_videos;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        //toString(): converts array object to String, returns string
        String [] names = {"John", "Smith","Shay", "Breanna", "Josh"};


        //sort(): sorts the array in ascending order
        int [] numbers = {5, 1, 3, 4, 2, 0};

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------");

        // equal(): compares two array objects if they have same elements in same order
        char [] arr1 = {'a', 'b', 'c'};
        char [] arr2 = {'b', 'a', 'c'};

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr1); // {'a', 'b', 'c'};
        Arrays.sort(arr2); // {'a', 'b', 'c'};

        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println("-------------------------");


        //copyOf(array, newLength): copies the specified array elements and sets new length, returns
        int [] scores = {45, 55, 65, 75, 85};
        int [] scores2 = Arrays.copyOf(scores, 3);

        System.out.println(Arrays.toString(scores2));


        System.out.println("-------------------------");


        //copyOfRange(array, begIndex, endIndex): copies the specified range of the array, returns new array
        char [] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
        //index:             0    1    2    3    4    5

        char [] someElements = Arrays.copyOfRange(elements, 1, 5);

        System.out.println(Arrays.toString(someElements));




    }
}
