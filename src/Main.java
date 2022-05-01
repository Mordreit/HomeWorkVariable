public class Main {
    public static void main(String[] args) {

        // Задача 1

        byte a = 9;
        short b = 327;
        int c = 23451;
        long d = 546786L;
        float e = 2.5f;
        double f = 3.5435;
        char g = 'r';
        boolean h = true;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);

        // Задача 2

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");
        System.out.println("Разница в весе " + weightDifference + " кг");

        // Задача 3

        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;
        double breakfast = banana * 5 + milk * 2 + iceCream * 2 + eggs * 4;
        double breakfastInKilo = breakfast / 1000;
        System.out.println("Общий вес спорт-завтрака " + breakfastInKilo + " кг" );

        // Задача 4

        int needToReset = 7000;
        int weightLost = 250;
        int moreWeightLost = 500;
        double smallLoads = needToReset / weightLost;
        double heavyLoads = needToReset / moreWeightLost;
        System.out.println("Спортсмен похудеет через " + smallLoads + " дней");
        System.out.println("Спортсмен похудеет через " + heavyLoads + " дней");

        // Задача 5

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaNewSalary = (mashaSalary * 0.1) + mashaSalary;
        double mashaAnnualDifference = mashaNewSalary * 12 - mashaSalary * 12;
        double denisNewSalary = (denisSalary * 0.1) + denisSalary;
        double denisAnnualDifference = denisNewSalary * 12 - denisSalary * 12;
        double kristinaNewSalary = (kristinaSalary * 0.1) + kristinaSalary;
        double kristinaAnnualDifference = kristinaNewSalary * 12 - kristinaSalary * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей." + "Годовой доход вырос на  " + mashaAnnualDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей." + "Годовой доход вырос на  " + denisAnnualDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей." + "Годовой доход вырос на  " + kristinaAnnualDifference + " рублей");


    }
}