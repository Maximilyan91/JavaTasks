package kodesourceTasks.basicPart1;

import java.util.Scanner;

/**
 * Напишите программу на Java для печати значения ascii данного символа.
 */
public class Task41 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для перевода в кодировку ASCII: ");
        String line = in.nextLine();

        char[] symbols = line.toCharArray();

        for (char symbol : symbols) {
            System.out.print("Значение в кодировке ASCII: " + (int) symbol);
        }

    }

}
