package HomeWork7;

//импорт библиотек
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// создаем класс Анаграмма
public class Anagram {
//создаем метод
    public static boolean isAnagram(String s, String t) {
        // проверка строка null или нет. сравниваем длину строк
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Создаем карту для подсчета символов
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toLowerCase().toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toLowerCase().toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Символ отсутствует в первой строке
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        ///вводим данные с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String t = scanner.nextLine();

        boolean result = isAnagram(s, t);
        System.out.println("Являются ли анаграммами: " + result);

        scanner.close();
    }
}