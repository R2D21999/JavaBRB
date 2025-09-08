package homeworks.homework011.test;

import homeworks.homework011.model.Car;
import homeworks.homework011.repository.CarsRepository;
import homeworks.homework011.repository.CarsRepositoryImpl;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список автомобилей
        List<Car> cars = Arrays.asList(
                new Car("a123me", "Mercedes", "White", 0, 8300000),
                new Car("b873of", "Volga", "Black", 0, 673000),
                new Car("w487mn", "Lexus", "Grey", 76000, 900000),
                new Car("p987hj", "Volga", "Red", 610, 704340),
                new Car("c987ss", "Toyota", "White", 254000, 761000),
                new Car("o983op", "Toyota", "Black", 698000, 740000),
                new Car("p146op", "BMW", "White", 271000, 850000),
                new Car("u893ii", "Toyota", "Purple", 210900, 440000),
                new Car("l097df", "Toyota", "Black", 108000, 780000),
                new Car("y876wd", "Toyota", "Black", 160000, 1000000)
        );

        // Создаем репозиторий
        CarsRepository repository = new CarsRepositoryImpl(cars);

        // Количество уникальных моделей в ценовом диапазоне
        long minPrice = 700000L;
        long maxPrice = 800000L;
        long uniqueModelsCount = repository.countUniqueModelsInPriceRange(minPrice, maxPrice);
        System.out.println("Уникальные автомобили: " + uniqueModelsCount + " шт.");

        // Цвет автомобиля с минимальной стоимостью
        String cheapestColor = repository.findColorOfCheapestCar();
        System.out.println("Цвет автомобиля с минимальной стоимостью: " + cheapestColor);



        // Сохраняем результаты в файл
        String output = generateOutput(uniqueModelsCount, cheapestColor);
        repository.saveToFile("cars.txt", output);

        // Читаем из файла и выводим содержимое
        System.out.println("\nСодержимое файла cars.txt:");
        String fileContent = repository.readFromFile("cars.txt");
        System.out.println(fileContent);
    }

    private static String generateOutput(long uniqueModelsCount, String cheapestColor) {
        StringBuilder sb = new StringBuilder();
        sb.append("Результаты анализа:\n\n");
        sb.append("Уникальные автомобили в диапазоне: ").append(uniqueModelsCount).append(" шт.\n");
        sb.append("Цвет автомобиля с минимальной стоимостью: ").append(cheapestColor).append("\n");
        return sb.toString();
    }
}