package com.brendongomes.pattern.core;

public interface IArticleBuilder {
    IArticleBuilder author(String author);
    IArticleBuilder title(String title);
    IArticleBuilder tags(String... tags); // varargs
    IArticleBuilder totalPages(int total);
    IArticleBuilder publishedIn(int day, int month, int year);
    IArticleBuilder text(String text);
    IArticle get();
}
