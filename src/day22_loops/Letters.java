package day22_loops;

public class Letters {
    public static void main(String[] args) {

        // a - z lowercase

        char lowerCaseUp = 'a';

        while(lowerCaseUp <= 'z'){

            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }

        System.out.println();

        // Z - A upper case

        char upperCaseBack = 'Z';  // int i = 122;   ascii

        while (upperCaseBack >= 'A'){  // 1 >= 97
            System.out.print(upperCaseBack + " ");  // (char)i
            upperCaseBack--;
        }


    }
}
