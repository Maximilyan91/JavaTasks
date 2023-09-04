package kodesourceTasks.BasicPart1;

import java.util.Scanner;

public class Task33 {
    /**
     * Напишите программу на Java и вычислите сумму цифр целого числа
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        long num = input.nextLong();
        System.out.println("Сумма цифр введенного числа: " + sumDigits(num));
    }

    public static int sumDigits(long num) {
        int sum = 0;
        while (num != 0) {
            sum = (int) (sum + num % 10);
            num = num / 10;
        }
        return sum;
    }
}
