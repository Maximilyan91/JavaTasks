package kodesourceTasks.BasicPart1;

import java.util.Scanner;

public class Task32 {
    /**
     * Напишите программу на Java для сравнения двух чисел.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " больше " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " меньше " + num2);
        } else {
            System.out.println(num1 + " равно " + num2);
        }
    }

}
