package org.skypro.skyshop;

public class Main {
    public static void main(String[] args) {
        SimpleProduct pen = new SimpleProduct("Ручка", 100);
        SimpleProduct book = new SimpleProduct("Книга", 500);
        SimpleProduct box = new SimpleProduct("Коробка",200);
        SimpleProduct sticker = new SimpleProduct("Стикер", 150);
        SimpleProduct pencil = new SimpleProduct("Карандаш", 50);
        SimpleProduct marker = new SimpleProduct("Маркер", 300);
        FixPriceProduct slimeFix = new FixPriceProduct("Слайм");
        DiscountedProduct penDiscount = new DiscountedProduct(pen.getNamedAbs(), 100, 20 );
        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
        ProductBasket basket3 = new ProductBasket();

        System.out.println("Добавление продукта в корзину");
        basket1.addProduct (pen);
        basket1.addProduct (pen);
        basket1.addProduct (pencil);
        basket1.addProduct (book);
        basket1.addProduct (box);
        System.out.println("Добавление продукта в корзину в которой нет свободного места.");
        basket1.addProduct (marker);
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



    }
    }