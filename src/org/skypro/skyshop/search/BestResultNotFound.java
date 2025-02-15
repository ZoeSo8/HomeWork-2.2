package org.skypro.skyshop.search;

public class BestResultNotFound extends Exception{
    private String query;

    public BestResultNotFound(String query){
        super("Такого запроса нет: " + query);
        this.query = query;
        }
    public String getQuery() {
        return query;
    }
}
