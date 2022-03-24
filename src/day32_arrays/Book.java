package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        /*

        flow:
            how many chapters are there
            make a book with that many chapters
            write the chapters one at a time
                break up each chapter by sentences
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters are there");
        String [][] book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter " + (i + 1));
            String chapter = input.nextLine();
            String [] sentences = chapter.split("\\.");  // breaking up by the dot
            book[i] = sentences;
        }

        System.out.println(Arrays.deepToString(book));

    }
}
