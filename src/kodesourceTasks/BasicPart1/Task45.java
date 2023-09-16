package kodesourceTasks.BasicPart1;

import java.io.File;

/** Напишите программу на Java, чтобы найти размер указанного файла. */
public class Task45 {

    public static void main(String[] args) {
        File file = new File("C:/Users/Максим/Pictures/491588.jpg");
        if (file.exists()) {
            System.out.println("Размер файла в байтах: " + getFileSizeInBytes(file));
            System.out.println("Размер файла в килобайтах: " + getFileSizeInKiloBytes(file));
            System.out.println("Размер файла в мегабайтах: " + getFileSizeInMegaBytes(file));
        }

    }

    public static double getFileSizeInBytes(File file) {
        return file.length();
    }

    public static double getFileSizeInKiloBytes(File file) {
        return file.length() / 1024d;

    } public static double getFileSizeInMegaBytes(File file) {
        return file.length() / (1024d * 1024d);
    }


}
