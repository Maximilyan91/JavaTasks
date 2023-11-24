package kodesourceTasks.collections.arrayListTasks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args) {

        /*
         * 1. Напишите программу на Java, чтобы создать новый список массивов,
         * добавить несколько цветов (строку) и распечатать коллекцию.
         * */

        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        System.out.println(colors);


        ArrayList<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("Orange");
        colorsTwo.add("Green");
        colorsTwo.add("Silver");

        /*
        2. Напишите Java-программу для итерации всех элементов списка массивов.
        * */
        System.out.println("Результат 2 задания:\n");
        for (String color : colors) {
            System.out.println(color);
        }

        /*3. Напишите Java-программу для вставки элемента в список массивов в первой позиции.*/

        colors.add(0, "Brown");
        System.out.println("Результат 3 задания:\n" + colors.get(0) + "\n");

        /*4. Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов.*/

        System.out.println("Результат 4 задания:\n" + colors.get(3) + "\n");

        /*5. Напишите Java-программу для обновления определенного элемента массива по заданному элементу.*/

        colors.set(3, "Grey");
        System.out.println("Результат 5 задания:\n" + colors + "\n");

        /*6. Напишите программу на Java для удаления третьего элемента из списка массивов.*/

        colors.remove(2);
        System.out.println("Результат 6 задания:\n" + colors + "\n");

        /*7. Напишите программу на Java для поиска элемента в списке массивов.*/

        boolean isContains = colors.contains("Yellow");
        System.out.println("Результат 7 задания:\n" + isContains);

        /*8. Напишите программу на Java для сортировки заданного списка массивов.*/

        colors.sort(Comparator.reverseOrder());
        System.out.println("Результат 8 задания:\n" + colors);

        /*9. Напишите программу на Java для копирования одного списка массивов в другой.*/

        colors.addAll(1, colorsTwo);

        System.out.println("Результат 9 задания:\n" + colors);

        /*10. Напишите программу на Java для перемешивания элементов в списке массивов.*/

        Collections.shuffle(colors);
        System.out.println("Результат 10 задания:\n" + colors);

        /*11. Напишите Java-программу для обращения элементов в списке массивов.*/

        Collections.reverse(colors);
        System.out.println("Результат 11 задания:\n" + colors);

        /*12. Напишите программу на Java для извлечения части списка массивов.*/

        List<String> newList;
        newList = colors.subList(2, colors.size());
        System.out.println("Результат 12 задания:\n" + newList);

        /*13. Напишите программу на Java для сравнения двух списков массивов.*/

        List<String> compare = new ArrayList<>();
        for (String color : colors) {
            compare.add(colorsTwo.contains(color) ? "yes" : "no");
        }
        System.out.println("Результат 13 задания:\n" + compare);

        /*14. Напишите Java-программу, поменявшую два элемента в списке массивов.*/

        System.out.println("Результат 14 задания до изменения:\n" + colors);
        Collections.swap(colors, 0, 5);
        System.out.println("Результат 14 задания после изменения:\n" + colors);

        /*15. Напишите программу на Java для объединения двух списков массивов.*/

        List<String> joinColors = new ArrayList<>();
        joinColors.addAll(colors);
        joinColors.addAll(colorsTwo);
        System.out.println("Результат 15 задания:\n" + joinColors);

        /*16. Напишите Java программу для клонирования списка массивов в другой список массивов.*/

        List<String> newColors = new ArrayList<>(colors);
        System.out.println(newColors);

        /*17. Напишите Java программу, чтобы очистить список массивов */

        newColors.clear();
        System.out.println("Результат 17 задания:\n" + newColors);

        /*18. Напишите Java-программу для проверки того, что список массивов пуст или нет.*/

        System.out.println("Результат 18 задания со списком newColors:\n" + (newColors.isEmpty() ? "yes" : "no"));
        System.out.println("Результат 18 задания со списком colors:\n" + (colors.isEmpty() ? "yes" : "no"));

        /*19. Напишите программу на Java, чтобы урезать емкость списка массивов текущим размером списка. */

        colorsTwo.trimToSize();

        /*20. Напишите программу на Java, чтобы увеличить размер списка массивов*/

        colorsTwo.ensureCapacity(30);

        /*21. Напишите Java программу, чтобы заменить второй элемент ArrayList указанным элементом*/
        System.out.println(colorsTwo);
        colorsTwo.set(1, "Purple");
        System.out.println("Результат 21 задания:\n" + colorsTwo);

        /*22. Напишите Java-программу для печати всех элементов ArrayList, используя расположение элементов.*/

        for (String color : colors) {
            System.out.println(color);
        }
    }

}
