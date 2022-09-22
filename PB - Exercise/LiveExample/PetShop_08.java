package LiveExample;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPackageDogs = Integer.parseInt(scanner.nextLine());
        int countPackageCats = Integer.parseInt(scanner.nextLine());

        double priceDogs = countPackageDogs * 2.50;
        double priceCats = countPackageCats * 4.00;
        double totalSum = priceDogs + priceCats;

        System.out.println(totalSum + " lv.");
    }
}
