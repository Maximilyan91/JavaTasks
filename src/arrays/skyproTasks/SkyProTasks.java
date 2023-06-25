package arrays.skyproTasks;

public class SkyProTasks {

    public static void main(String[] args) {
        /*
         * Распечатайте на отдельной строчке элементы
         * каждого массива в обратном порядке через запятую.
         * В конце строки запятую ставить не надо
         * */
        System.out.println("Задача №1");

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }

        /*Пройдитесь по целочисленному массиву
         и все нечетные числа в нем сделайте четными*/

        System.out.println("\nЗадача №2");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }System.out.print(arr[i] + " ");
        }
    }
}
