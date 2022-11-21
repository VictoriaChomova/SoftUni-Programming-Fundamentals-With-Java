package E08DataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входни данни:
        //-сила
        //-дистанция
        //-умора;

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        // създаваме брояч на успешните поуквания;
        int originPokePower = pokePower;
        int pokesCount = 0;
        // изваждаме дистанцията от силата, докато силата < дистанцията;
        while (pokePower >= distance) {
            pokePower -= distance;
            pokesCount++;
            // когато силата стане  равна на силата/2, тогава я разделяме на фактор умора.
            // ако такова делене не е възможно, продължаваме програмата;
            if (pokePower == originPokePower / 2) {
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }


            // Принтираме:
            //- остатъка от силата;
            //- броят на успешните поуквания;
        }
        System.out.println(pokePower);
        System.out.println(pokesCount);
    }
}
