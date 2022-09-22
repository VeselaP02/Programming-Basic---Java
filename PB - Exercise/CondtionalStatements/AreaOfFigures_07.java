package CondtionalStatements;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFigured = scanner.nextLine();

        double area = 0;
        if (typeFigured.equals("square")) {
            double side =Double.parseDouble(scanner.nextLine());

            area = side * side;

        } else if (typeFigured.equals("rectangle")) {
            double a =Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (typeFigured.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;

        } else if (typeFigured.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = a * h/2;
        }
        System.out.printf("%.3f", area);
    }
}
