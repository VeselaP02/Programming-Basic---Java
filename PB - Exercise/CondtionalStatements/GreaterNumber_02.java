package CondtionalStatements;

import java.util.Scanner;

public class GreaterNumber_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum);

        } else  {
            System.out.println(secondNum);
        }

    }
}
