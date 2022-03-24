package day23_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aahahhihihisad";
        int counter = 0;

        for(int index = 0; index < str.length() - 1; index++){

            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                counter++;
            }

        }

        System.out.println(counter);

    }
}


/*



 */