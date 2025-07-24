package ru.rtk.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();


        String[] words = stroka.split(" ");
           for (int i = 0; i < words.length; i = i + 1) {
                //
              String lowerWord = words[i].toLowerCase();
              char[] chars = lowerWord.toCharArray();
              Arrays.sort(chars);
              words[i] = new String(chars);
        }

        System.out.println(String.join(" ", words));
    }
}