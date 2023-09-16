package kodesourceTasks.BasicPart1;

/**
 * Напишите программу на Java, чтобы перевернуть строку
 */
public class Task37 {

    public static void main(String[] args) {
        String str = "123456  789";
        char[] arrayStr = str.toCharArray();

        for (int i = arrayStr.length - 1; i >= 0; i--) {
            System.out.print(arrayStr[i]);
        }
    }

}
