package L14Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println (new DecimalFormat("0.####").format(numberPower(number, power)));
    }

    public static double numberPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }

}
