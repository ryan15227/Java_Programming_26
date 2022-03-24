package day04_variables;

public class School {
    public static void main(String[] args) {

        int grade1 = 100;
        int grade2 = 150;
        int grade3 = 200;
        int grade4 = 250;
        int grade5 = 300;
        int total = grade1 + grade2 + grade3 + grade4 + grade5 ;
        System.out.println("Students in grade 1: " + grade1 +"\nStudents in grade 2: " + grade2 +"\nStudents in grade 3: " + grade3 +"\nStudents in grade 4: " + grade4 + "\nStudents in grade 5: " + grade5);
        System.out.println("Total number of students: " + total + "\n");
        double DaysInYear = 365.5;
        double SnowDays = 55.5;
        double AvgGpa = 2.75;
        System.out.println("Amount of days in a year: " +DaysInYear);
        System.out.println("Amount of snow days: " +SnowDays);
        System.out.println("Average GPA in school: " +AvgGpa);

    }
}
