package L05BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11MultiplicationTableVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        do {
            System.out.printf("%d X %d = %d%n", n, z, n * z);
            z++;
        } while (z <= 10);
    }
}

