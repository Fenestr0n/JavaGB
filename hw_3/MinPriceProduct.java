package hw_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class MinPriceProduct {
    public static void main(String[] args) {
        ExtProduct product1 = new ExtProduct("Шоколад", "Россия", 0.1, 95, 2);
        ExtProduct product2 = new ExtProduct("Сыр", "Голландия", 0.2, 235, 1);
        ExtProduct product3 = new ExtProduct("Молоко", "Россия", 1.0, 75, 1);
        ExtProduct product4 = new ExtProduct("Майонез", "Россия", 0.6, 155, 2);
        ExtProduct product5 = new ExtProduct("Кетчуп", "США", 0.3, 130, 3);

        List<ExtProduct> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        int sort = scanner.nextInt();
        scanner.close();

        Integer minPrice = 1000;
        String nameProduct = "None";
        for (ExtProduct extProduct : allProducts) {
            if (extProduct.getSort() == sort) {
                if (extProduct.getPrice() < minPrice) {
                    minPrice = extProduct.getPrice();
                    nameProduct = extProduct.getName();
                }
            }
        }
        System.out.println("Товар " + sort + " сорта с наименьшей ценой: " + nameProduct);
    }
}
