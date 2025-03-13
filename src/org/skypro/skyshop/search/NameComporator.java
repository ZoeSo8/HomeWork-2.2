package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.Comparator;

    public static class NameComparator implements Comparator<Product> {
        @Override
        public int compare(Product a1, Product a2) {
            int lengthComparison = Integer.compare(a1.getNamedAbs().length(), a2.getNamedAbs().length()) * -1;{
                return -lengthComparison;
            }
            return a1.getNamedAbs().compareTo(a2.getNamedAbs());
        }

}
