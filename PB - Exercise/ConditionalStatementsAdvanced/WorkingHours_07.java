package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean isWorkingDay  = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday");
        boolean isWorkingHour = hours >= 10 && hours <= 18;
        if (isWorkingDay && isWorkingHour) {
            System.out.println("open");
        } else {
                System.out.println("closed");
            }
        }
    }
