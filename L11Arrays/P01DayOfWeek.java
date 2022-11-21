package L11Arrays;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 0 && n <= 7) {
            String currentDay = weekDays[n - 1];
            System.out.println(currentDay);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
