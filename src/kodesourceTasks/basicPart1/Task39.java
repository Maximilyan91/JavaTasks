package kodesourceTasks.basicPart1;

import java.util.Arrays;

public class Task39 {

    /**
     * Напишите Java-программу для создания и отображения уникального трехзначного числа с использованием 1, 2, 3, 4. Также подсчитайте, сколько существует трехзначных чисел.
     */

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Уникальные трехзнвчные числа: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i != j && i != k && k != j) {
                        int[] numbers = {i, j, k};
                        System.out.println(Arrays.toString(numbers));
                        count++;
                    }
                }
            }
        }System.out.println("Всего уникальных чисел: " + count);
    }
}


