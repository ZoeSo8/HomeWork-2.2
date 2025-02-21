package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

public interface Searchable {
    String searchTerm ();
    String gettingContentType ();

    default String getStringRepresentation(){
        return this.getClass().getSimpleName()+" - "+gettingContentType();
    }


    boolean containsKey(String query);

    boolean containsValue(Product query);
}
