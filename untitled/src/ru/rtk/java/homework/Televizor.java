package ru.rtk.java.homework;

public class Televizor {
    // Приватные поля
    private String model;
    private int size;
    private int volume;

    // Конструктор
    public Televizor(String model, int size) {
        this.model = model;
        this.size = size;
        volume = 50;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int screenSize) {
        this.size = screenSize;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Метод класса
    public void changeVolume(int newVolume) {
        volume = newVolume;
        System.out.println("Громкость установлена на " + volume);
    }


}