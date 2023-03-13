package hw_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class MaxPriceProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Сахар песок", 100, 1);
        Product product2 = new Product("Мармелад высший вкус", 85, 2);
        Product product3 = new Product("Горох высший пилотаж", 130, 1);
        Product product4 = new Product("Яйца перепелиные", 75, 3);
        Product product5 = new Product("Сметана деревенская", 55, 3);

        List<Product> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);

        Integer maxPrice = 0;
        for (Product product : allProducts) {
            if ((premium(product.getName(), "высший")) && ((product.getSort() == 1 || product.getSort() == 2))){
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена товара: " + maxPrice);    
    }

    public static boolean premium(String strName, String findStr) {
        if (strName.contains(findStr)) return true;
        return false;    
        
    }
}
