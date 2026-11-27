package lesson2;


public class Main {
    public static void main(String[] args) {
        // --- Задание 2: Массив из 5 товаров ---
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024", "Apple Inc.", "USA", 4899, false);
        productsArray[2] = new Product("PlayStation 5 Pro", "07.11.2024", "Sony", "Japan", 3200, true);
        productsArray[3] = new Product("Кофемашина DeLonghi", "10.05.2024", "De'Longhi", "Italy", 1850, false);
        productsArray[4] = new Product("Ноутбук Lenovo Legion", "20.08.2024", "Lenovo", "China", 4100, false);

        System.out.println("=== Список товаров ===");
        for (Product product : productsArray) {
            product.printInfo();
        }

        System.out.println("\n=== Аттракционы парка ===");
        Park cityPark = new Park("Парк Горького");

        Park.Attraction ferrisWheel = cityPark.new Attraction("Колесо обозрения", "10:00 - 22:00", 10.0);
        Park.Attraction rollerCoaster = cityPark.new Attraction("Американские горки", "11:00 - 21:00", 15.5);

        ferrisWheel.printAttractionInfo();
        rollerCoaster.printAttractionInfo();
    }
}
