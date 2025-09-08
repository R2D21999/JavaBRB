package homeworks.homework011.repository;
import homeworks.homework011.model.Car;
import java.util.List;

public interface CarsRepository {
    List<Car> getAllCars();
    long countUniqueModelsInPriceRange(long minPrice, long maxPrice);
    String findColorOfCheapestCar();
    void saveToFile(String filename, String content);
    String readFromFile(String filename);
}