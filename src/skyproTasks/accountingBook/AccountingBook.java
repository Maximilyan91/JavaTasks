package skyproTasks.accountingBook;

import java.util.Random;

public class AccountingBook {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача №1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("\nЗадача №2");

        int[] arr = generateRandomArray();
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int j : arr) {
            if (minValue < j) {
                minValue = j;
            } else if (maxValue > j) {
                maxValue = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minValue + " рублей" + "\nМаксимальная сумма трат за день составила: " + maxValue + " рублей");
    }

    public static void task3() {
        System.out.println("\nЗадача №3");

        int[] arr = generateRandomArray();
        int sum = 0;
        double averageValue;
        for (int j : arr) {
            sum += j;
        }
        averageValue = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за день составила: " + averageValue + " рублей");
    }

    public static void task4() {
        System.out.println("\nЗадача №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
