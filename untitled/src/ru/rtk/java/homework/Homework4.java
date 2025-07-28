package ru.rtk.java.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println("Введите маленькую букву  английского алфавита:");
        char inputChar = scanner.next().charAt(0);
        int index = stroka.indexOf(inputChar);
        int predIndex;
        if (index==0){
            predIndex = stroka.length() -1;}
        else {
            predIndex = index -1;}
        System.out.println("Результат:" + stroka.charAt(predIndex));
    }
}