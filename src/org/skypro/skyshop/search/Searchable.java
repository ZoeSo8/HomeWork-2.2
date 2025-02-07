package org.skypro.skyshop.search;

public interface Searchable {
    String searchTerm ();
    String gettingContentType ();

    default String getStringRepresentation(){
        return this.getClass().getSimpleName()+" - "+gettingContentType();
    }


}
