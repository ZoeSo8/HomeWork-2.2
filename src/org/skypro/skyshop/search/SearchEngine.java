package org.skypro.skyshop.search;
import org.skypro.skyshop.product.Product;

import java.util.*;

public class SearchEngine {
    private List<Searchable> items;
    private int count;

    public SearchEngine(int size) {
        items = new ArrayList<>();
        count = 0;
    }

    public void add(Searchable item) {
        if (count < items.size()) {
            items.set(count++, item);
        } else {
            System.out.println("Массив заполнен. Невозможно добавить новый элемент.");
        }
    }

    public Map<String, Searchable> search(String query) {
        Map<String,Searchable> results = new TreeMap<>(Comparator.reverseOrder());
        for (Searchable searchable : items) {
            if (searchable != null && searchable. containsKey(query)) {
                results.put(searchable.searchTerm(),searchable);
            }
        }
        return results;
    }
    public Map<String, Searchable> search(Product query) {
        Map<String,Searchable> results = new TreeMap<>(Comparator.reverseOrder());
        for (Searchable searchable : items) {
            if (searchable != null && searchable.containsValue(query)) {
                results.put(searchable.searchTerm(),searchable);
            }
        }
        return results;
    }
    public Searchable searchBestResult (String query) throws BestResultNotFound {
        int maxAmount =0;
        Searchable bestResult= null;
        for (Searchable current: items){
        int amount = 0;
        int index = 0;
        String searchTerm  = current.searchTerm();
        int indexSubstring = searchTerm.indexOf(query, index);

        while(indexSubstring != -1){
            amount++;
            index = index + query.length();
            indexSubstring = searchTerm.indexOf(query, index);
        }
            if (amount>maxAmount) {
                maxAmount = amount;
                bestResult =current;
            }
        }
        if (query == null){
            throw new BestResultNotFound(query);
            }
        return bestResult;
    }
}




