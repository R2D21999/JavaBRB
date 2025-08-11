package homework.homework06;
//импорт
import java.util.ArrayList;
//создаем класс АПП для проверки кода
public class App {
    public static void main(String[] args) {
        // Создаем программы
        Program news = new Program("Новости", 2.5, 1000);
        Program movie = new Program("Фильм 'Трансформеры'", 6.2, 1750);
        Program show = new Program("Стендап", 3.2, 9000);

        // Создаем каналы
        Channel channel1 = new Channel("Первый", 1, news);
        Channel channel2 = new Channel("Россия", 2, movie);
        Channel channel3 = new Channel("ТНТ", 3, show);

        ArrayList<Channel> channels = new ArrayList<>();
        channels.add(channel1);
        channels.add(channel2);
        channels.add(channel3);

        // Создаем телевизор
        TV tv = new TV(channels);

        // Проверяем
        System.out.println(tv);
        tv.powerOnOff();
        System.out.println(tv);
        tv.changeChannel(2);
        tv.changeChannel(3);
        tv.changeChannel(5); // Несуществующий канал ошибка
        tv.powerOnOff();
        tv.changeChannel(1); // Попытка переключить при выключенном ТВ
    }
}