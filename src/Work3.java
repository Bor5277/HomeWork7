public class Work3 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " Сумма накопленицй равна " + total);
        }
        // Задача 2
        System.out.println("Задача 2");
        double percent  = 0.12;
        double totalBank = 0;
        for (int i = 0; i <= 12; i++) {
            totalBank = (totalBank + savings) * (1 + percent );
            System.out.println("Месяц " + i + " Сумма накопленицй равна " + totalBank);
        }
    }
}
