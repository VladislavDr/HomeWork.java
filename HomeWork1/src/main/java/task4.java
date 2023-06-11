//4.** Написать метод, которому на вход подается одномерный массив и число n
//        (может быть положительным, или отрицательным), при этом метод должен
//        сместить все элементы массива на n позиций. Элементы смещаются циклично.
//        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//        при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону
//        сдвиг можете выбирать сами.


import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите количество эллементов массива: ");
        Scanner scannerNumArray = new Scanner(System.in);
        int numArr = scannerNumArray.nextInt();
        int [] array = new int [numArr];

        arrayRnd(array);

        System.out.println("Введите число, на которое нужно сдвинуть эллементы массива: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp;
        if (num < 0) {
        int count = (numArr - 1) * num;
            while (count < 0) {
                for (int i = 1; i < array.length; i++) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        if (num > 0) {
            int count = (numArr - 1) * num;
            while (count > 0) {
                for (int i = (array.length-1); i > 0; i--) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    count--;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static int rnd(){
        Random random = new Random();
        return random.nextInt();
    }
    public static void arrayRnd(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd();
        }
        System.out.println(Arrays.toString(arr));
    }

}
