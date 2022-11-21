package E08DataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;
         while (people > 0) {
             people -= elevatorCapacity;
             courses++;
             }
        System.out.println(courses);
         }
    }

