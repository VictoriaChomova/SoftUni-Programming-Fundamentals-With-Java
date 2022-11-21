package E08DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegsCount = Integer.parseInt(scanner.nextLine());
        double biggestKegVolume = Double.MIN_VALUE;
        String biggestKeg = "";
        String model = "";
        for (int i = 1; i <= kegsCount; i++) {
            model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
