package arrays.accountingBook;

import java.util.Random;

public class AccountingBook {

    public static int[] generateRandomArray(){
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {


    }
}
