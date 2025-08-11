package homework.homework06;

//импорт
import java.util.Objects;
//создаем класс Программа
class Program {
    //приватные права
    private String name;
    private double rating;
    private int viewers;
    //конструктор класса с параметрами
    public Program(String name, double rating, int viewers) {
        this.name = name;
        this.rating = rating;
        this.viewers = viewers;
    }
    //создаем геттеры
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getViewers() {
        return viewers;
    }
    //герерация equals,hashCode, toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return Double.compare(program.rating, rating) == 0 && viewers == program.viewers && Objects.equals(name, program.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, viewers);
    }

    @Override
    public String toString() {
        return name + " (Рейтинг: " + rating + ", Зрителей: " + viewers + ")";// Полиморфизм
    }
}
