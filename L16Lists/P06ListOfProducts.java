package L15Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();

            productsList.add(product);
        }

        Collections.sort(productsList);

        for (int i = 1; i <= productsList.size(); i++) {
            System.out.printf("%d.%s%n", i, productsList.get(i-1));
        }
    }
}
