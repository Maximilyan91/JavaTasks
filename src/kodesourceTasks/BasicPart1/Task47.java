package kodesourceTasks.BasicPart1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Напишите программу на Java для отображения текущей даты и времени в определенном формате.
 * Пример вывода:
 * <p>
 * Сейчас: 2017/06/16 08: 52: 03.066
 */
public class Task47 {

    public static void main(String[] args) {

        SimpleDateFormat currentDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.sss");
        currentDateTime.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println(currentDateTime.format(System.currentTimeMillis()));
    }
}
