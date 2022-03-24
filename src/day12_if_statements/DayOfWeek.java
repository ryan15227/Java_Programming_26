package day12_if_statements;

public class DayOfWeek {
    public static void main(String[] args) {

        int day = 7;


        if(day == 1){
            System.out.println("MONDAY");
        } else if(day == 2){
            System.out.println("TUESDAY");
        } else if(day == 3){
            System.out.println("WEDNESDAY");
        } else if(day == 4){
            System.out.println("THURSDAY");
        } else if(day == 5){
            System.out.println("FRIDAY");
        } else if(day == 6){
            System.out.println("SATURDAY");
        } else if(day == 7){
            System.out.println("SUNDAY");
        } else {
            System.out.println("INVALID DAY");
        }
    }
}

/*

    Declare and assign a number (day)

        1 - monday
        2 - tuesday
        3 - wednesday
        4 - thursday
        5 - friday
        6 - saturday
        7 - sunday
 */