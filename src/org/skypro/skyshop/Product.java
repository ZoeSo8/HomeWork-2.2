package org.skypro.skyshop;

public class Product {
    private String named;
    private int price;

    public Product (String named, int price) {
        this.named = named;
        this.price = price;
    }

    public String getNamed() {
        return this.named;
    }

    public int getPrice() {
        return this.price;
    }

    public void setNamed(String named) {
        this.named = named;
    }

        public void setPrice(int price) {
            this.price = price;
        }
        @Override
        public String toString() {
            return "Наименование " + this.named + ", Цена " + this.price;
        }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(named,price);
        }
        @Override
        public boolean equals(Object other){
            if (this == other){
                return true;
            }
            if (other == null || this.getClass() != other.getClass()) {
                return false;
            }
            Product c2 = (Product) other;
            return named.equals(c2.named)&& this.price == c2.price;
        }
    }
