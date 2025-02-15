package org.skypro.skyshop.search;

public class SearchEngine {
    private Searchable[] items;
    private final int MAX_SEARCH_RESULTS = 5;
    private int count;

    public SearchEngine(int size) {
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
    public Searchable[] search(String query) {
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




