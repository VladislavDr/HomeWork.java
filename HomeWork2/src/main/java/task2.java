//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task2 {

    private static final Logger logger = Logger.getLogger(task2.class.getName());

    public static void init() throws IOException {
        FileHandler log = new FileHandler("log.xml");

        logger.addHandler(log);

        XMLFormatter xml = new XMLFormatter();
        log.setFormatter(xml);
    }

    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.info(Arrays.toString(sortArr));
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        init();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bubbleSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }

    }
}