package WhileLoopLab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String passInput = scanner.nextLine();
        while (!passInput.equals(password)) {

            passInput = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", username);
    }
}
