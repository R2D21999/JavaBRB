package ru.rtk.java.homework;

public class App {
    public static void main(String[] args) {
        Televizor tv1 = new Televizor("Samsung", 65);
        Televizor tv2 = new Televizor("LG", 43);

        // Выводим информацию по ТВ 1
        System.out.println("Работа с телевизором 1:");
        tv1.changeVolume(70);


        // Выводим информацию по ТВ 2
        System.out.println("Работа с телевизором 2:");
        tv2.changeVolume(30);


        // Ввод с клавиатуры
        System.out.println("Введите параметры нового телевизора:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        System.out.print("Размер: ");
        int size = scanner.nextInt();

        Televizor tv3 = new Televizor(model, size);
        System.out.println(" Создан телевизор " + tv3.getModel() +
                " с экраном " + tv3.getSize() + " дюймов");
    }
}