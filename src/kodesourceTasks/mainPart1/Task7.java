package kodesourceTasks.mainPart1;

import java.util.Scanner;

public class Task7 {

    /**
     * Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = in.nextInt();
        for (int num2 = 1; num2 <= 10; num2++) {
            int sum = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + sum);
        }
    }
}
