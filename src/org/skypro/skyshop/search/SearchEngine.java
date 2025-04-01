package org.skypro.skyshop.search;
import org.skypro.skyshop.Article;
import org.skypro.skyshop.product.Product;
import java.util.Comparator;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchEngine {
    private final Set<Searchable> items;
    private int count;

    public SearchEngine() {
        this.items = new HashSet<>();
        count = 0;
    }

    public void add(Searchable item) {
        if (count < items.size()) {
            items.add(item);
            count++;
        } else {
            System.out.println("Массив заполнен. Невозможно добавить новый элемент.");
        }
    }
    public Set<String> search(String query) {
        return items.stream()
                .filter(searchable -> searchable.getSearchTerm().contains(query))
                .collect(Collectors.toCollection(() -> new TreeSet<>(new NameComparator())));


        public Searchable searchBestResult(String query) throws BestResultNotFound {
            int maxAmount = 0;
            Searchable bestResult = null;
            for (Searchable current : items) {
                int amount = 0;
                int index = 0;
                String searchTerm = current.searchTerm();
                int indexSubstring = searchTerm.indexOf(query, index);

                while (indexSubstring != -1) {
                    amount++;
                    index = index + query.length();
                    indexSubstring = searchTerm.indexOf(query, index);
                }
                if (amount > maxAmount) {
                    maxAmount = amount;
                    bestResult = current;
                }
            }
            if (query == null) {
                throw new BestResultNotFound(query);
            }
            return bestResult;
        }

            }
}




