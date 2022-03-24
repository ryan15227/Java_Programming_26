package day24_loops;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is a java language.java";
        int counter = 0;

        while(str.contains("java")){
            System.out.println(str);
            str = str.replaceFirst("java", "*");
            counter++;
        }
        System.out.println(counter);
        System.out.println(str);

    }
}
