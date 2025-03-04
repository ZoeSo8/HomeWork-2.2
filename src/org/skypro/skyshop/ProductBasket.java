package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List> products = new HashMap<>();
    private int size = 0;


    public ProductBasket() {
        this.products = new HashMap<>();
    }

    public void addProduct(String namedAbs, Product product) {
       List<Product> productList= products.getOrDefault(namedAbs, new ArrayList<>());
       productList.add(product);
       products.put(namedAbs,productList);}

    public int summBasket() {
        int summ = 0;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                if (product != null) {
                    summ += product.getPrice();
                }
            }
        }
        return summ;
    }

    public int getProductCount() {
        int count = 1;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
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
        }
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                if (product != null) {
                    System.out.println(product);
                }
            }
        }
        System.out.println("Итого специальных продуктов: " + summSpecialProduct());
        System.out.println("Итого: " + summBasket());
    }

    public int summSpecialProduct() {
        int SpecialProduct = 0;
        for  (List<Product> productList : products.values()) {
            for (Product product : productList) {
                if ((product != null && product.isSpecial()) == true) {
                    if (product.isSpecial()) ;
                    SpecialProduct++;
                }
            }
        }
        return SpecialProduct;
    }

    public boolean findByName(Product productToFind) {
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
            if (product != null && productToFind != null && product.getNamedAbs().equals(productToFind.getNamedAbs())) {
                return true;
            }
        }
            }
        return false;
    }

    public void clearBasket() {
        products.clear();
    }

       public List<Product> removeProductsByName(String nameDelete) {
           Iterator<Product> iterator = products.listIterator();
           List<Product> removedProducts = new ArrayList<>();
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
