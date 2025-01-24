package org.skypro.skyshop;

import java.util.Arrays;

public class ProductBasket {
    private static Product[] products;
    private static int freeIndex;
    private static int MAX_PRODUCTS = 5;


    public void ProductBasket() {
        this.products = new Product[MAX_PRODUCTS];
        this.freeIndex = 0;
    }

    public static void addProduct(Product product) {
        if (freeIndex < MAX_PRODUCTS) {
            products (freeIndex) = product;
            freeIndex++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }
    public static int summBasket() {
        int summ = 0;
        for (Product product : products) {
            if (product != null) {
                summ += product.getPrice();
            }
        }
        return summ;
    }

    public int getProductCount() {
        int count = 1;
        for (Product product : products) {
            if (product != null) {
                count++;
            }
        }
        return count;
    }

    public void printBasket() {
        if (getProductCount() <= 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (Product product : products) {
            if (product != null) ;
            {
                System.out.println(product.getNamed() + " " + product.getPrice());
            }
        }
        System.out.println("Итого: " + summBasket());
    }

    public boolean findByName(Product name) {
        for (Product product : products) {
            if (product != null && product.getNamed().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        Arrays.fill(products, null);
    }

}
