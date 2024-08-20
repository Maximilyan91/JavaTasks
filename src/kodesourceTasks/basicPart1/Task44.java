package kodesourceTasks.basicPart1;

import java.util.Scanner;

/**
 * Напишите программу на Java, которая принимает целое число (n) и вычисляет значение n + nn + nnn
 */

public class Task44 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = input.nextInt();
        value(num);
    }

    static void value(int num) {

        String doubleStr = num + "" + num;
        String tripleStr = num + "" + num + num;

        int doubleValue = Integer.parseInt(doubleStr);
        int tripleValue = Integer.parseInt(tripleStr);

        int result = num + doubleValue + tripleValue;

        System.out.println(" Значение " + num + " + " + doubleValue + " + " + tripleValue + " = " + result);
    }


}
