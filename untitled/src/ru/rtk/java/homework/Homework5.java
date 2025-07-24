package ru.rtk.java.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Укажите стрелки >>--> или <--<<");
        Scanner scanner = new Scanner(System.in);
        String posled = scanner.nextLine();
        int count = 0;

        if (posled.length() > 106) {
            System.out.println("Ошибка: строка превышает максимально допустимую длину 106 символов)");
            return;
        }
        Pattern pattern = Pattern.compile(">>-->|<--<<");
        Matcher matcher = pattern.matcher(posled);

        while (matcher.find()) {
            count++;
        }

        System.out.println("Найдено стрелок: " + count);
    }
}
