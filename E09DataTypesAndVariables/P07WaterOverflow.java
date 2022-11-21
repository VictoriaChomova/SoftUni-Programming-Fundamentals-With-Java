package E08DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        for (int i = 1; i <= n ; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (quantities > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                tankCapacity -= quantities;
            }
        }
        System.out.println(Math.abs(tankCapacity - 255));
    }
}
