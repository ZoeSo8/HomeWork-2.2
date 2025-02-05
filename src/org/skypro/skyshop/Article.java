package org.skypro.skyshop;

public class Article implements Searchable {

    private final String articleTitle;
    private final String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }
    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }
    @Override
    public String toString() {
        return "Название статьи: " + this.articleTitle+"\nТекст статьи: " + this.articleText;
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


