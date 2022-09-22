package ForLoop_Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int EvenSum = 0;
        int OddSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if ((i % 2 == 0)) {
                EvenSum = EvenSum + currentNum;
            } else {
                OddSum =OddSum +currentNum;
            }
        }
        if (EvenSum == OddSum) {
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d",EvenSum);
        } else {
            int diff = Math.abs(EvenSum - OddSum);
            System.out.printf("No%n");
            System.out.printf("Diff = %d",diff);
        }

    }
}
