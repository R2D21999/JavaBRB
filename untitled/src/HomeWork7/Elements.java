package HomeWork7;

//импорт библиотек
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
//создаем класс Элементы
public class Elements {

//создаем метод, который возвращает уникальные элементы из списка
    public static <T> Set<T> getElementsOrdered(ArrayList<T> list) {
        //возвращает уникальные элементы (должен сохранить порядок)
        return new LinkedHashSet<>(list);
    }
//указываем исходные данные
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        Set<Integer> uniqueNumbers = getElementsOrdered(numbers);
        // выводим исхдный список
        System.out.println("Исходный список: " + numbers);
        //выводим уникальные значения
        System.out.println("Уникальные элементы : " + uniqueNumbers);
    }
}