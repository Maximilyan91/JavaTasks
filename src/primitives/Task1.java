package primitives;

public class Task1 {

    /**
     * Написать код, который присвоит переменной a значение переменной b и наоборот.
     * реализовать задачу, НЕ используя третью переменную.
     */

    public static void main(String[] args) {

        int a = 7;
        int b = 19;

        System.out.println("a = " + a + "\nb = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);

    }
}
