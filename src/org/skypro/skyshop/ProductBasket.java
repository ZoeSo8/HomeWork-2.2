package org.skypro.skyshop;

import java.util.Arrays;

public class ProductBasket {
    private Product[] products;
    private int size = 0;
    private static int MAX_PRODUCTS = 5;


    public ProductBasket() {
        this.products = new Product[MAX_PRODUCTS];

    }

    public void addProduct(Product product) {
        if (size < MAX_PRODUCTS) {
            products [size] = product;
            size++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }
    public int summBasket() {
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
        if (size == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (Product product : products) {
            if (product != null)
            {
                System.out.println(product.getNamed() + " " + product.getPrice());
            }
        }
        System.out.println("Итого: " + summBasket());
    }

    public boolean findByName(Product productToFind) {
        for (Product product : products) {
            if (product != null && productToFind !=null && product.getNamed().equals(productToFind.getNamed())) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        Arrays.fill(products, null);
    }

}
