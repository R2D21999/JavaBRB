package ru.rtk.java.homework;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для Васи (0 - камень, 1 - ножницы, 2 - бумага): ");
        int Vasya = scanner.nextInt();
        System.out.println("Введите данные для Пети (0 - камень, 1 - ножницы, 2 - бумага): ");
        int Petya = scanner.nextInt();

        //Условие для проверки
        if (Vasya == Petya) {
            System.out.println("Ничья!");
        } else if (Vasya == 0 && Petya == 1) {
            System.out.println("Победил Вася!");
        } else if (Vasya == 1 && Petya == 2) {
            System.out.println("Победил Вася!");
        } else if (Vasya == 2 && Petya == 0) {
            System.out.println("Победил Вася!");
        } else {
            System.out.println("Победил Петя!");
        }
    }

}