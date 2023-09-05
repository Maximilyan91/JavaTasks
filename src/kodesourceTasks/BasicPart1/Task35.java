package kodesourceTasks.BasicPart1;

import java.util.Scanner;

public class Task35 {
    /**
     * Напишите программу на Java для вычисления площади многоугольника */
    public static void main(String[] args) {


        int numberOfSize;
        int lengthOfSize;

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите количество сторон многоугольника: ");
        numberOfSize = in.nextInt();
        System.out.println("Введите длину стороны многоугольника: ");
        lengthOfSize = in2.nextInt();

        System.out.println("Площадь многоугольника равна: " + polygonSquare(numberOfSize, lengthOfSize));

    }

    private static double polygonSquare(int numberOfSize, int lengthOfSize) {
        return (numberOfSize * (lengthOfSize * lengthOfSize)) / (4.0 * Math.tan((Math.PI / numberOfSize)));
    }
}
