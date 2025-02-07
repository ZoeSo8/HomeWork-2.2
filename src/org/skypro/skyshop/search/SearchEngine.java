package org.skypro.skyshop.search;

public class SearchEngine {
    private static Searchable[] items;
    private static final int MAX_SEARCH_RESULTS =5;
    private static int count;

    public SearchEngine (int size){
        items = new Searchable[size];
        count = 0;
    }
    public void add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            System.out.println("Массив заполнен. Невозможно добавить новый элемент.");
        }
    }
    public static Searchable[] search(String query) {
        Searchable [] results = new Searchable[MAX_SEARCH_RESULTS];
        int i=0;
        for (Searchable searchable: items){
            if (searchable !=null && searchable.gettingContentType().contains(query)) {
                results [i++]  = searchable;
            }
            if (i>= MAX_SEARCH_RESULTS) {
                break;
            }
        }
        return results;
    }



}
