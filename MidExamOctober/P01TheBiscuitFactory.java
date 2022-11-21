package MidExamOctober;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int competingFactoryBiscuitsPer30Days = Integer.parseInt(scanner.nextLine());
        // Да се пресметне производството на бисквити за 30 дни;
        int regularDayProduction = biscuitsPerDayPerWorker * workersCount;
        int biscuitsCount = 0;
        for (int day = 1; day <= 30; day++) {

            // Всеки трети ден производсвото е равно на 75% от нормалното -> след пресмятане закръгляме надолу;
            if (day % 3 == 0) {
                biscuitsCount += Math.floor(regularDayProduction * 0.75);
            } else {
                biscuitsCount += regularDayProduction;
            }
        }

        // Накрая принтираме "You have produced {countBiscuits} biscuits for the past month."
        System.out.printf("You have produced %d biscuits for the past month.%n", biscuitsCount);

        // Да се пресметне разликата между двете фабрики в %;
        double differenceInPercent = (biscuitsCount - competingFactoryBiscuitsPer30Days) * 100.0 / competingFactoryBiscuitsPer30Days;

        // Принтираме процентите:    •	"You produce {percentage} percent more biscuits."
        //                  •	"You produce {percentage} percent less biscuits."
        if (differenceInPercent < 0) {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(differenceInPercent));
        } else {
            System.out.printf("You produce %.2f percent more biscuits.", differenceInPercent);
        }




    }
}
