package org.skypro.skyshop;

public class Main {
    public static void main(String[] args) {
        Product pen = new Product("Ручка", 100);
        Product book = new Product("Книга", 500);
        Product box = new Product("Коробка",200);
        Product sticker = new Product("Стикер", 150);
        Product pencil = new Product("Карандаш", 50);
        Product marker = new Product("Маркер", 300);
        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();

//Добавление продукта в корзину.
        basket1.addProduct (pen);
        basket1.addProduct (pen);
        basket1.addProduct (pencil);
        basket1.addProduct (book);
        basket1.addProduct (box);
        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket1.addProduct (marker);
        //Печать содержимого корзины с несколькими товарами.
        basket1.printBasket();
        //Получение стоимости корзины с несколькими товарами.
        basket1.getProductCount();
        //Поиск товара, который есть в корзине.
        System.out.println(basket1.findByName(pen));
        //Поиск товара, которого нет в корзине.
        basket1.findByName(sticker);
        //Очистка корзины.
        basket1.clearBasket();
        //Печать содержимого пустой корзины.
        basket2.printBasket();
        //Получение стоимости пустой корзины.
        basket2.getProductCount();
        //Поиск товара по имени в пустой корзине.
        basket2.findByName(sticker);


    }
    }