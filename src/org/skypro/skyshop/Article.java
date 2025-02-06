package org.skypro.skyshop;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {

    private final String title;
    private final String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return "Название статьи: " + this.title+"\nТекст статьи: " + this.text;
    }

    @Override
    public String gettingContentType() {
        return toString();
    }

    @Override
    public String searchTerm() {
        return "ARTICLE";
    }


}


