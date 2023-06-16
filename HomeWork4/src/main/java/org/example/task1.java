//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//        > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//        > java
//        > python
//        > c#
//        > print
//< [c#, python, java]
//        > revert
//        > print
//< [python, java]
//        > revert
//        > revert
//        > print
//< []
//        > revert -> throw new NoSuchElementException

package org.example;

import java.util.Scanner;
import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Stack<String> stc = new Stack<>();
        System.out.println("Введите различные слова или строки, разделяя их кнопкой Enter: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String consoleRead = scanner.nextLine();
            if ("exit".equals(consoleRead)) {
                break;
            }

            if (!("remove".equals(consoleRead) || "print".equals(consoleRead))){
                stc.add(consoleRead);
            }

            try {
                if ("print".equals(consoleRead)) {
                    if (stc.size() != 0) {
                        System.out.println(stc);
                    }
                    else {
                        System.err.println("Больше строк нет :( ");
                    }
                }
                else if ("remove".equals(consoleRead)) {
                    stc.pop();
                    if (stc.size() == 0) {
                        System.out.println("Это была последняя строчка");
                    }
                }

            } catch (Exception e) {
                System.err.println("Больше строк нет :( ");
            }
        }
    }
}
