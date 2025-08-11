package homework.homework06;
//Импорт
import java.util.ArrayList;
import java.util.Objects;
//создаем класс ТВ
class TV {
    //создаем приватные поля
    private boolean isOn;
    private ArrayList<Channel> channels;
    private int currentChannel;
    //создаем конструктор с параметром
    public TV(ArrayList<Channel> channels) {
        this.channels = channels;
        this.isOn = false;
        this.currentChannel = 1;
    }
    // создаем метод класса
    public void powerOnOff() {
        isOn = !isOn;
        System.out.println("Телевизор " + (isOn ? "включен" : "выключен")); //Абстракция
    }

    public void changeChannel(int channelNumber) {
        if (!isOn) {
            System.out.println("Телевизор выключен, нельзя переключить канал"); //Абстракция 
            return;
        }
        //делаем цикл for
        for (Channel channel : channels) {
            if (channel.getNumber() == channelNumber) { // условие
                currentChannel = channelNumber;
                System.out.println("Переключено на канал: " + channel);
                return;
            }
        }
        System.out.println("Канал " + channelNumber + " не найден");
    }

    public Channel getCurrentChannel() {
        for (Channel channel : channels) {
            if (channel.getNumber() == currentChannel) {
                return channel;
            }
        }
        return null;
    }
    // генерируем equals, hashCode, toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return isOn == tv.isOn && currentChannel == tv.currentChannel && Objects.equals(channels, tv.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOn, channels, currentChannel);
    }
    // делаем переопределение
    @Override
    public String toString() {
        if (!isOn) return "Телевизор выключен";
        Channel current = getCurrentChannel();
        return "Телевизор включен. Текущий канал: " + (current != null ? current : "неизвестен"); //Полиморфизм
    }
}