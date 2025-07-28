package attestation.attestation01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим данные покупателя
        System.out.println("Введите имя покупателя:");
        String personName = scanner.nextLine();
        System.out.println("Введите количество денег:");
        int personMoney = Integer.parseInt(scanner.nextLine());

        //исключения
        Person person;
        try {
            person = new Person(personName, personMoney);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        // продукты
        Product[] products = {
                new Product("Хлеб", 40),
                new Product("Молоко", 60),
                new Product("Торт", 1000),
                new Product("Кофе растворимый", 879),
                new Product("Масло", 150),
                new Product("Мороженное",200)
        };

        System.out.println("Продукты в наличии:");
        for (Product p : products) {
            System.out.println(p);
        }

        // d ввод продуктов
        System.out.println("\nВведите название продукта для покупки (для завершения введите END):");
        while (true) {
            String productName = scanner.nextLine().trim();
            if (productName.equalsIgnoreCase("END")) {
                break;
            }

            boolean productFound = false;
            for (Product p : products) {
                if (p.getProduct_name().equalsIgnoreCase(productName)) {
                    person.buyProduct(p);
                    productFound = true;
                    break;
                }
            }
            if (!productFound) {
                System.out.println("Продукт '" + productName + "' не найден");
            }
        }

        System.out.println("\n" + person);
    }
}