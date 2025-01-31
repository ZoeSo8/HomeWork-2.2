package org.skypro.skyshop;

import java.util.Objects;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPricePercent;
    private int discountPrice;

    public DiscountedProduct(String namedAbs, int basePrice, double discountPricePercent) {
        super(namedAbs);
        this.basePrice = basePrice;
        this.discountPricePercent = (int) discountPricePercent;
    }
    @Override
    public int getPrice() {
        int discount = (basePrice*discountPricePercent)/100;
        return discountPrice =basePrice-discount;
    }
    //<имя продукта со скидкой>: <стоимость> (<скидка>%)
    @Override
    public String toString() {
        return this.getNamedAbs()+": стоимость "+this.getPrice() + " (скидка "+discountPricePercent+ "%)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountedProduct that = (DiscountedProduct) o;
        return basePrice == that.basePrice && discountPricePercent == that.discountPricePercent && discountPrice == that.discountPrice;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basePrice, discountPricePercent, discountPrice);
    }
}

