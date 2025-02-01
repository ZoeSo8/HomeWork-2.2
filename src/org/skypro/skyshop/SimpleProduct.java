package org.skypro.skyshop;

public class SimpleProduct extends Product {
    private static int priceSimple;

    public SimpleProduct (String nameAbs, int priceSimple){
        super(nameAbs);
        this.priceSimple = priceSimple;
    }

    @Override
    public int getPrice() {
        return priceSimple;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SimpleProduct that = (SimpleProduct) o;
        return priceSimple == that.priceSimple;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.getNamedAbs(), priceSimple);
    }

    @Override
    public String toString() {
        return "Наименование " + super.getNamedAbs() + " Цена" +getPrice();
    }
}
