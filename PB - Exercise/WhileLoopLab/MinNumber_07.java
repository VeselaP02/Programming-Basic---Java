package WhileLoopLab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < min) {
                min = currentNum;
            }
            input = scanner.nextLine();

        }
        System.out.println(min);
    }
}
