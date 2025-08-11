package homework.homework06;
//импорт
import java.util.Objects;
//создаем класс Канал
class Channel {
    //приватные поля
    private String name;
    private int number;
    private Program currentProgram; //используем Инкапсуляцию

    public Channel(String name, int number, Program currentProgram) {
        this.name = name;
        this.number = number;
        this.currentProgram = currentProgram;
    }
    //геттеры
    public String getName() { //используем Инкапсуляцию вроде как
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Program getCurrentProgram() {
        return currentProgram;
    }
    //создаем метод
    public void setCurrentProgram(Program program) {
        this.currentProgram = program;
    }
    //Генерация equals,hashCode, toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return number == channel.number && Objects.equals(name, channel.name) && Objects.equals(currentProgram, channel.currentProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, currentProgram);
    }

    @Override
    public String toString() {
        return number + ". " + name + " - " + currentProgram; // Полиморфизм
    }
}
