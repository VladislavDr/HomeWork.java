//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.util.Scanner;
import java.time.*;
import java.time.temporal.*;


public class task3 {
    public static void main(String[] args)  {
        System.out.println("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String wellcome = "";

        LocalTime time = LocalTime.now();

        if (time.isAfter(LocalTime.parse("05:00"))) wellcome = "Доброе утро";
        if (time.isAfter(LocalTime.parse("12:00"))) wellcome = "Добрый день";
        if (time.isAfter(LocalTime.parse("18:00"))) wellcome = "Добрый вечер";
        if (time.isAfter(LocalTime.parse("23:00"))) wellcome = "Доброй ночи";
        System.out.println(wellcome + " " + name);
    }
}
