//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа


package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        int size = 5;
        createRnd(lst, size);
        maxNum(lst);
        minNum(lst);
        avg(lst);
        deleteNum(lst);
    }

    public static void createRnd(List<String> lst, int size) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            lst.add(String.valueOf(rnd.nextInt(0, 50)));
        }
        System.out.println( "Произвольный список чисел : " + lst);
    }

    public static void maxNum(List<String> lst) {
        int max = Integer.parseInt(lst.get(0));
        for (int i = 1; i < lst.size(); i++) {
            if (Integer.parseInt(lst.get(i)) > max) {
                max = Integer.parseInt(lst.get(i));
            }

        }
        System.out.println("max : " + max);
    }

    public static void minNum(List<String> lst) {
        int min = Integer.parseInt(lst.get(0));
        for (int i = 1; i < lst.size(); i++) {
            if (Integer.parseInt(lst.get(i)) < min) {
                min = Integer.parseInt(lst.get(i));
            }

        }
        System.out.println("min : " + min);
    }

    public static void avg(List<String> lst){
        int i = 0;
        int sum = 0;
        while( i < lst.size()){
            sum += Integer.parseInt(lst.get(i));
            i++;
        }
        int avg = sum / lst.size();
        System.out.println("Среднее арифмтичиское : " + avg);
    }

    public static void deleteNum(List<String> lst){
        for (int i = 1; i < lst.size(); i++) {
            if ((Integer.parseInt(lst.get(i)) % 2) == 0 ) {
                lst.remove(i);
            }
        }
        System.out.println(lst);
    }
}