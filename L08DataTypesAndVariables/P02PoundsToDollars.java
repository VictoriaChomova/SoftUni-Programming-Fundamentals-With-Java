package L08DataTypesAndVariables;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());
        double pounds = dollars * 1.36;
        System.out.printf("%.3f", pounds);
    }
}
