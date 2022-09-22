package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        boolean isValidData = true;

        double result = 0;

        if (town.equals("Sofia")) {
            if (s >= 0 && s <=500) {
                result = s * 0.05;
            } else if ( s >= 500 && s <= 1000) {
                result = s * 0.07;
            } else if (s >= 1000 && s <= 10000) {
                result = s * 0.08;
            } else if (s > 10000){
                result = s * 0.12;
            } else {
                isValidData =false;
            }
        } else if (town.equals("Varna")) {
            if (s >= 0 && s <=500) {
                result = s * 0.045;
            } else if ( s >= 500 && s <= 1000) {
                result = s * 0.075;
            } else if (s >= 1000 && s <= 10000) {
                result = s * 0.10;
            } else if (s >10000) {
                result = s * 0.13;
            } else {
                isValidData = false;
            }
        } else if (town.equals("Plovdiv")) {
            if (s >= 0 && s <=500) {
                result = s * 0.055;
            } else if ( s >= 500 && s <= 1000) {
                result = s * 0.08;
            } else if (s >= 1000 && s <= 10000) {
                result = s * 0.12;
            } else if (s >10000) {
                result = s * 0.145;
            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }
        if (isValidData) {
            System.out.printf("%.2f",result);
        } else {
            System.out.println("error");
        }
    }
}
