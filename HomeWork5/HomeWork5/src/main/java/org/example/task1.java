//Реализовать консольное приложение - телефонный справочник.
//        У одной фамилии может быть несколько номеров.
//        Пользователь может вводить команды:
//        1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
//        2: GET Ivanov - получить список всех номеров по фамилии
//        3: REMOVE Ivanov - удалить все номера по фамилии
//        4: LIST - Посмотреть все записи
//        5: EXIT - Завершить программу
//
//        Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
//        .
//
//        Пример взаимодействия (=> - это вывод на консоль):
//        ADD Ivanov 8 800 555 35 35
//        ADD Ivanov 8 800 100 10 10
//        GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
//        ADD Petrov 8 555 12 34
//        LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
//        REMOVE Ivanov
//        LIST => Petrov = [8 555 12 34]
//        GET NoName => Не найдена запись с фамилией "NoName"
//        REMOVE NoName => Не найдена запись с фамилией "NoName"3


package org.example;

import java.util.*;

public class task1 {
    private static final Map<String, Set<String>> contacts = new HashMap<>();

    public static void main(String[] args) {
        menu();


    }

    public static void menu() {
        while (true) {
            System.out.println("Введите add, если хотите добавить в контакты человека.\n" +
                    "Введите get, если хотите получить весь список телефонов по фамилии.\n" +
                    "Введите remove, чтобы удалить из контактов. \n" +
                    "Введите list, если хотите посмотреть все записи\n" +
                    "Введите exit, если хотите выйти из программы\n");
            Scanner scanner = new Scanner(System.in);
            String consoleRead = scanner.next();

            switch (consoleRead) {
                case "add":
                    addContact(contacts);
                case "remove":
                    removeContact(contacts);
                case "list":
                    System.out.println(contacts);
                case "get":
                    getContact(contacts);
                case "exit":
                    System.exit(0);
            }
        }
    }

    public static Map<String, Set<String>> addContact(Map<String, Set<String>> contacts) {


        System.out.println("Введите back для выхода в главное меню. \n" +
                "Введите addname для ввода номера телефона контакта");
        Scanner inputString = new Scanner(System.in);
        String inputStr = inputString.next();

        switch (inputStr) {
            case "back":
                break;

            case "addname": {
                System.out.println("Введите фамилию человека\n");
                Scanner inputName = new Scanner(System.in);
                String name = inputName.next();

                System.out.println("Введите номер телефона человека\n");

                Scanner inputNum = new Scanner(System.in);
                String num = inputNum.next();
                Set<String> numbers = contacts.get(name);

                if (numbers == null) {
                    numbers = new HashSet<>();
                    numbers.add(num);
                } else {
                    numbers.add(num);
                }
                contacts.put(name, numbers);
                System.out.println("Номер успешно добавлен");
                break;
            }
        }
        return contacts;
    }


    public static void removeContact(Map<String, Set<String>> contacts) {
        System.out.println("Введите фамилию человека\n");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.next();

        if (contacts.containsKey(name)){
            contacts.remove(name);
        }else{
            System.out.println("Такого человека не найдено");
        }
    }


    public static void getContact(Map<String, Set<String>> contacts){
        System.out.println("Введите фамилию человека\n");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.next();

        if (contacts.containsKey(name)){
            System.out.println("По данному запросу найдены следующие совпадения: \n  " + contacts.get(name));
        }
        else{
            System.out.println("Такого человека не найдено");
        }
    }
}

