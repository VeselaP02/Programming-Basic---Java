package LiveExample;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double greeningMeters = Double.parseDouble(scanner.nextLine());

        double priceForAllYard =greeningMeters * 7.61;
        double discount = 0.18 *  priceForAllYard;
        double totalSum = priceForAllYard - discount;

        System.out.printf("The final price is: %.2f lv.%n", totalSum);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
