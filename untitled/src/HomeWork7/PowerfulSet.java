package HomeWork7;
// импорт библиотек
import java.util.HashSet;
import java.util.Set;
// создаем класс PowerfulSet
public class PowerfulSet {
//Создал метод Пересечение
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

//Создал метод Объединение
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
//Создал метод Разность
    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
//создал объект класса
        PowerfulSet ps = new PowerfulSet();

        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(0, 1, 2, 4);
//вывел данные
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Пересечение: " + ps.intersection(set1, set2));
        System.out.println("Объединение: " + ps.union(set1, set2));
        System.out.println("Разность: " + ps.relativeComplement(set1, set2));
    }
}