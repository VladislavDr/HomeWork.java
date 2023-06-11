//2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
//        из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по
//        следующему принципу: индексы таких элементов равны,
//        то есть [0][0], [1][1], [2][2], …, [n][n];
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int [][] arg = new int[num][num];
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if ((i == j) || (i+j == num - 1)) {
                    arg[i][j] = 1;
                }
                else{
                    arg[i][j] = 0;
                }
                System.out.print(arg[i][j]);
            }
            System.out.println();
        }


    }
}
