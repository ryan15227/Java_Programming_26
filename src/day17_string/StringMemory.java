package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java";  //String literal, IN STRING POOL

        String second = new String("java");  // String object, not in String pool, but directly in the HEAP


        System.out.println(first == second);  // false

        // == with string types gives you false. The == doesn't compare the characters, it compares the MEMORY LOCATION of the OBJECT

        String third = "java";
        System.out.println(first == third);

        String fourth = "Java";  // at this line, how many objects in the String pool: 2
            // you have "java" and "Java"

        System.out.println(first == fourth);

        // at this point how many total objects are there. 3 -> 2 in the string pool and 1 separate object directly in the heap

        String fifth = new String("java");
        System.out.println(second == fifth);  // false because fifth creates its own object therefore it makes more memory {memory slut}

    }
}
