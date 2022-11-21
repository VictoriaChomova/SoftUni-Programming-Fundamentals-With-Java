package L05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        //Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
        //Weekday	12$	18$	12$
        //Weekend	15$	20$	15$
        //Holiday	5$	12$	10$

        switch (dayType) {
            case "Weekday":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }
                break;
            case "Weekend":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
                break;
        }
        if (price == 0) {
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }
    }
}
