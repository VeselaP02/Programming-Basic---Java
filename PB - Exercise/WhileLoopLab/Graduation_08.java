package WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name =scanner.nextLine();

        int years = 1;
        double sumAllGrades = 0;
        boolean isExcluded = false;

        double poorGrade = 0;
        while (years <= 12) {
            if ( poorGrade > 1) {
                isExcluded = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGrade++;
                continue;
            }

            sumAllGrades += grade;
            years++;


        }
        double averageGrade = sumAllGrades / 12;

        if (!isExcluded) {
            System.out.printf("%s graduated. Average grade: %.2f", name , averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade",name,years);
        }
    }
}
