package E11Arrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        String [] peopleArr = new String[wagons];
        int sumPeople = 0;

        for (int i = 0; i <= peopleArr.length - 1 ; i++) {
            peopleArr [i] = scanner.nextLine();
            sumPeople += Integer.parseInt(peopleArr[i]);
        }
        System.out.println(String.join(" ", peopleArr));
        System.out.println(sumPeople);
    }
}
