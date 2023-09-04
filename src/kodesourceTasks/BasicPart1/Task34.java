package kodesourceTasks.BasicPart1;

import java.util.Scanner;

public class Task34 {

    /**
     * Напишите программу на Java для вычисления площади шестиугольника
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину стороны равного шестиугольника: ");
        double sideSize = in.nextInt();
        System.out.println("Площадь правильного шестиугольника равна: " + hexagonSquare(sideSize));
    }

    public static double hexagonSquare(double sideSize) {
        double sideSizeSquare = sideSize * sideSize;
        double hexagonSquare = (3 * Math.sqrt(3) * sideSizeSquare) / 2;
        return hexagonSquare;
    }
}

