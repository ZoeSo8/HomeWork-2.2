package org.skypro.skyshop;

public interface Searchable {
    String searchTerm ();
    String gettingContentType ();

    default String getStringRepresentation(){
        return this.getClass().getSimpleName()+" - "+gettingContentType();
    }


}
