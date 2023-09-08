package kodesourceTasks.BasicPart1;

public class Task38 {

    /**
     * Напишите Java-программу для подсчета букв, пробелов, чисел и других символов входной строки
     */

    public static void main(String[] args) {

        String testString = "Ехали медведи на 156 .,";
        count(testString);
    }

    public static void count(String string) {
        char[] s = string.toCharArray();
        int letters = 0;
        int spaces = 0;
        int digits = 0;
        int otherSymbols = 0;

        int i = 0;

        while (i < s.length) {
            if (Character.isLetter(s[i])) {
                letters++;
            } else if (Character.isSpaceChar(s[i])) {
                spaces++;
            } else if (Character.isDigit(s[i])) {
                digits++;
            } else {
                otherSymbols++;
            }
            i++;
        }
        System.out.println("В данном тексте содержится: \n" + "Букв - " + letters + "\n" + "Пробелов - " + spaces + "\n" + "Чисел - " + digits + "\n" + "Остальных символов - " + otherSymbols + "\n");
    }
}
