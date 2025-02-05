package org.skypro.skyshop;

public interface Searchable {
//метод, который будет возвращать текст, по которому мы будем искать.
    String searchTerm ();
//который мы нашли. Метод должен возвращать строку с названием типа контента.
    String gettingContentType ();

    default String getStringRepresentation(){
        return this.getClass().getSimpleName()+" - "+gettingContentType();
        //«имя Searchable -объекта — тип Searchable -объекта».
    }


}
