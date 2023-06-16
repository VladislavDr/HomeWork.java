//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            int numb = scanner.nextInt();
            arr[i] = numb;
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.printf("min = %d", min).println();
        System.out.printf("max = %d", max);
    }


}
