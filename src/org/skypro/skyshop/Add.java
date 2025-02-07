package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        Product pen = new SimpleProduct("Ручка", 100);
        Product book = new SimpleProduct("Книга", 500);
        Product box = new SimpleProduct("Коробка", 200);
        Product sticker = new SimpleProduct("Стикер", 150);
        Product pencil = new SimpleProduct("Карандаш", 50);
        Product marker = new SimpleProduct("Маркер", 300);
        Product slimeFix = new FixPriceProduct("Слайм");
        Product penDiscount = new DiscountedProduct(pen.getNamedAbs(), 100, 20);
        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
        ProductBasket basket3 = new ProductBasket();
        Article penDescribe = new Article("Описание ручки", "Гелевая черная");
        SearchEngine request1 = new SearchEngine(5);
        Article pencilDescribe = new Article("Описание карандаш", "Меловой синий");
        Article boxDescribe = new Article("Описание коробки", "Малая подарочная");


        System.out.println("Добавление продукта в корзину");
        basket1.addProduct(pen);
        basket1.addProduct(pen);
        basket1.addProduct(pencil);
        basket1.addProduct(book);
        basket1.addProduct(box);
        System.out.println("Добавление продукта в корзину в которой нет свободного места.");
        basket1.addProduct(marker);
        System.out.println("Печать содержимого корзины с несколькими товарами.");
        basket1.printBasket();
        System.out.println("Получение стоимости корзины с несколькими товарами.");
        basket1.getProductCount();
        System.out.println("Поиск товара, который есть в корзине.");
        System.out.println(basket1.findByName(pen));
        System.out.println("Поиск товара, которого нет в корзине.");
        System.out.println(basket1.findByName(sticker));
        System.out.println("Очистка корзины.");
        basket1.clearBasket();
        System.out.println("Печать содержимого пустой корзины.");

        basket2.printBasket();
        System.out.println("Получение стоимости пустой корзины.");

        basket2.getProductCount();
        System.out.println("Поиск товара по имени в пустой корзине.");

        basket2.findByName(sticker);

        basket3.addProduct(book);
        basket3.addProduct(penDiscount);
        basket3.addProduct(slimeFix);
        basket3.printBasket();
        request1.add(pen);
        request1.add(penDiscount);
        request1.add(slimeFix);
        request1.add(penDescribe);
        request1.add(boxDescribe);

        String searchQuery1 = "Ручка";
        System.out.println(" \"" + searchQuery1 + "\": " + Arrays.toString(SearchEngine.search(searchQuery1)));
        String searchQuery2 = "Малая";
        System.out.println(" \"" + searchQuery2 + "\": " + Arrays.toString(SearchEngine.search(searchQuery2)));
        String searchQuery3 = "Ананас";
        System.out.println(" \"" + searchQuery3 + "\": " + Arrays.toString(SearchEngine.search(searchQuery3)));

    }

    }