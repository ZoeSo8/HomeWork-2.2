package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket  {
    private Map<String, Set<Product>> products = new HashMap<>();
    private int size = 0;


    public ProductBasket() {
        this.products = new HashMap<>();
    }

    public void addProduct(String namedAbs, Product product) {
       Set<Product> productSet = products.getOrDefault(namedAbs, new HashSet<>());
       productSet.add(product);
       products.put(namedAbs, productSet);}

    public int summBasket() {
        return products.values()
                .stream()
                .flatMap(Collection::stream)
                .mapToInt(Product::getPrice).sum();
    }

    public int getProductCount() {
        int count = 1;
        for (Set<Product> productSet : products.values()) {
            for (Product product : productSet) {
                if (product != null) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printBasket() {
        if (size == 0) {
            System.out.println("В корзине пусто");
            return;
        } else {
            products.values()
                    .stream()
                    .flatMap(Collection::stream)
                    .forEach(System.out::println);
            System.out.println("Итого специальных продуктов: " + summSpecialProduct());
            System.out.println("Итого: " + summBasket());
        }
    }

    public int summSpecialProduct() {
       return (int) products.values()
               .stream()
               .flatMap(Collection::stream)
               .filter(Product::isSpecial)
               .count();
                   }

    public boolean findByName(Product productToFind) {
        for (Set<Product> productSet : products.values()) {
            for (Product product : productSet) {
            if (product != null && productToFind != null && product.getNamedAbs().equals(productToFind.getNamedAbs())) {
                return true;
            }
        }
            }
        return false;
    }

    public void clearBasket() {
        this.products.clear();
    }

       public Set<Product> removeProductsByName(String nameDelete) {
           Iterator<Product> iterator = products.SetIterator();
           Set<Product> removedProducts = new HashSet<>();
        while (iterator.hasNext() && products!=null) {
            Product product = iterator.next();
            if (product.getNamedAbs().equalsIgnoreCase(nameDelete)) {
                removedProducts.add(product);
                iterator.remove();
            }
        }
        return removedProducts;
    }

}
