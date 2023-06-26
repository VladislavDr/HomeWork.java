//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork {
    public static void main(String[] args) {

        int numberLaptops = 10;

        ArrayList<Laptop> laptopArr = new ArrayList<>();

        System.out.println("На данный момент в наличи следующие ноутбуки: ");
        for (int i = 0; i < numberLaptops; i++) {
            Laptop laptops = new Laptop();

            laptops.setManufacturer(createRndManufacturer());
            laptops.setColor(createRndColor());
            laptops.setRAM(createRndRAM());
            laptops.setGPU(createRndGPU());
            laptops.setHDD(createRndHDD());
            laptops.setSSD(createRndSSD());
            laptops.setMotherboard(createRndMotherboard());
            laptops.setProcessor(createRndProcessor());

            System.out.println(laptops);

            laptopArr.add((laptops));
        }

        List<Laptop> result;


        while(true) {
            System.out.println("Введите manufacturer, если хотите выбрать конкретного производителя из всех имеющихся ноутбуков. \n " +
                    "Введите сolor, если хотите выбрать конкретный цвет ноутбука из всех имеющихся ноутбуков. \n " +
                    "Введите RAM, если хотите выбрать конкретный размер оперативной памяти из всех имеющихся ноутбуков. \n " +
                    "Введите GPU, если хотите выбрать конкретный размер памяти видеокарты из всех имеющихся ноутбуков. \n " +
                    "Введите HDD, если хотите выбрать конкретный размер памяти жесткого диска из всех имеющихся ноутбуков. \n " +
                    "Введите SSD, если хотите выбрать конкретный размер твердотельного накопителя из всех имеющихся ноутбуков. \n " +
                    "Введите motherboard, если хотите выбрать конкретный сокет из всех имеющихся ноутбуков. \n " +
                    "Введите processor, если хотите выбрать конкретное количество ядер процессора из всех имеющихся ноутбуков. \n " +
                    "Введите exit, если хотите выйти из программы \n");

            Scanner scanner = new Scanner(System.in);
            String menu = scanner.nextLine();

            switch (menu) {
                case "manufacturer":
                    System.out.println("Из представленных выше ноутбуков выберете по какому цвету отфильтровать список. \n");
                    Scanner scanner1 = new Scanner(System.in);
                    String manufact = scanner1.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getManufacturer().equals(manufact)).collect(Collectors.toList());
        //                laptopArr.stream().filter(laptop -> laptop.getManufacturer().equals(manufact)).forEach(System.out::println);
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "color":
                    System.out.println("Из представленных выше ноутбуков выберете по какому цвету отфильтровать список. \n");

                    Scanner scanner2 = new Scanner(System.in);
                    String color = scanner2.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getColor().equals(color)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "RAM":
                    System.out.println("Из представленных выше ноутбуков выберете по какому объему оперативной памяти отфильтровать список. \n");

                    Scanner scanner3 = new Scanner(System.in);
                    String RAM = scanner3.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getRAM().equals(RAM)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;
                case "GPU":
                    System.out.println("Из представленных выше ноутбуков выберете по какому объему памяти видеокарты отфильтровать список. \n");
                    Scanner scanner4 = new Scanner(System.in);
                    String GPU = scanner4.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getGPU().equals(GPU)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "HDD":
                    System.out.println("Из представленных выше ноутбуков выберете по какому объему памяти жесткого отфильтровать список. \n");
                    Scanner scanner5 = new Scanner(System.in);
                    String HDD = scanner5.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getHDD().equals(HDD)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "SSD":
                    System.out.println("Из представленных выше ноутбуков выберете по какому объему памяти твердотельного накопителя отфильтровать список. \n");
                    Scanner scanner6 = new Scanner(System.in);
                    String SSD = scanner6.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getSSD().equals(SSD)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "motherboard":
                    System.out.println("Из представленных выше ноутбуков выберете по какому сокету материнской платы отфильтровать список. \n");
                    Scanner scanner7 = new Scanner(System.in);
                    String motherboard = scanner7.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getMotherboard().equals(motherboard)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;

                case "processor":
                    System.out.println("Из представленных выше ноутбуков выберете по какому количеству ядер отфильтровать список. \n");
                    Scanner scanner8 = new Scanner(System.in);
                    String processor = scanner8.nextLine();

                    result = laptopArr.stream().filter(laptop -> laptop.getProcessor().equals(processor)).collect(Collectors.toList());
                    System.out.println("В наличии есть следующие ноутбуки: " + result);
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    public static String createRndManufacturer(){
        List<String> lstManufacturer = List.of("Apple", "Lenovo", "LG", "Asus", "Haier", "Acer");
        Random rnd = new Random();

        String manufact = lstManufacturer.get(rnd.nextInt(0, lstManufacturer.size()));
        return manufact;
    }

    public static String createRndColor(){
        List<String> lstColor = List.of("Blue", "Black", "White", "Gray", "Red");
        Random rnd = new Random();

        String color = lstColor.get(rnd.nextInt(0, lstColor.size()));
        return color;
    }

    public static String createRndRAM(){
        List<String> lstRAM = List.of("2GB", "4GB", "8GB", "16GB", "32GB");
        Random rnd = new Random();

        String RAM = lstRAM.get(rnd.nextInt(0, lstRAM.size()));
        return RAM;
    }

    public static String createRndGPU(){
        List<String> lstGPU = List.of("2GB", "4GB", "6GB", "8GB", "10GB", "12GB", "16GB");
        Random rnd = new Random();

        String RAM = lstGPU.get(rnd.nextInt(0, lstGPU.size()));
        return RAM;
    }

    public static String createRndHDD() {
        List<String> lstHDD = List.of("0.5TB", "1TB", "S2TB", "5TB");
        Random rnd = new Random();

        String RAM = lstHDD.get(rnd.nextInt(0, lstHDD.size()));
        return RAM;
    }

    public static String createRndSSD() {
        List<String> lstSSD = List.of("128GB", "256GB", "480GB", "1000GB", "2000GB", "absent");
        Random rnd = new Random();

        String RAM = lstSSD.get(rnd.nextInt(0, lstSSD.size()));
        return RAM;
    }

    public static String createRndMotherboard(){
        List<String> lstMotherboard = List.of("LGA 1700", "AM5", "AM4", "LGA 1200");
        Random rnd = new Random();

        String motherboard = lstMotherboard.get(rnd.nextInt(0, lstMotherboard.size()));
        return motherboard;
    }

    public static String createRndProcessor(){
        List<String> lstProcessor = List.of("6 cores", "16 cores", "8 cores", "4 cores");
        Random rnd = new Random();

        String processor = lstProcessor.get(rnd.nextInt(0, lstProcessor.size()));
        return processor;
    }

}
