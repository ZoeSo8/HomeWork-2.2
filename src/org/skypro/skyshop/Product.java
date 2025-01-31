package org.skypro.skyshop;

public abstract class Product {
    private String namedAbs;

    public Product (String namedAbs) {
        this.namedAbs = namedAbs;
    }

    public String getNamedAbs() {
        return this.namedAbs;
    }
    public abstract int getPrice();


    public void setNamed(String namedAbs) {
        this.namedAbs = namedAbs;
    }
        @Override
        public String toString() {
            return "Наименование " + this.namedAbs;
        }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(namedAbs);
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
            return namedAbs.equals(c2.namedAbs);
        }
        public abstract boolean isSpecial ();
}

