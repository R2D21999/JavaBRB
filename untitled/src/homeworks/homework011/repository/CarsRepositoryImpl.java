package homeworks.homework011.repository;

import homeworks.homework011.model.Car;
import java.io.*;
import java.util.*;




public class CarsRepositoryImpl implements CarsRepository {
    private List<Car> cars;

    public CarsRepositoryImpl(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }


    @Override
    public long countUniqueModelsInPriceRange(long minPrice, long maxPrice) {
        return cars.stream()
                .filter(car -> car.getPrice() >= minPrice && car.getPrice() <= maxPrice)
                .count();
    }

    @Override
    public String findColorOfCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingLong(Car::getPrice))
                .map(Car::getColor)
                .orElse("Не найдено");
    }

    @Override
    public void saveToFile(String filename, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Файл успешно сохранен: " + new File(filename).getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
        return content.toString();
    }
}