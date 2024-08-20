package kodesourceTasks.basicPart1;

import java.util.Scanner;

public class Task11 {

    /**
     * Напишите Java-программу для печати площади и периметра круга.
     */

    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double range = in.nextInt();

        double circleLength = 2 * pi * range;
        System.out.println("Длина окружности равна: " + circleLength);


        double areaCircle = pi * (range * range);
        System.out.println("Площадь круга: " + areaCircle);
    }
}
