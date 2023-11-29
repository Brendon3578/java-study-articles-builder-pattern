package com.brendongomes.pattern.builder;

import com.brendongomes.pattern.Blog;
import com.brendongomes.pattern.core.IArticle;
import com.brendongomes.pattern.core.IArticleBuilder;

import java.util.Arrays;
import java.util.Calendar;

public class BlogBuilder implements IArticleBuilder {
    private IArticle article;

    public BlogBuilder() {
        this.article = new Blog();
    }

    public static IArticleBuilder builder() {
        return new BlogBuilder();
    }

    @Override
    public IArticleBuilder author(String author) {
        this.article.setAuthor(author);
        return this;
    }

    @Override
    public IArticleBuilder title(String title) {
        this.article.setTitle(title);
        return this;
    }

    @Override
    public IArticleBuilder tags(String... tags) {
        this.article.setTags(Arrays.asList(tags));
        return this;
    }

    @Override
    public IArticleBuilder totalPages(int total) {
        this.article.setPages(total);
        return this;
    }

    @Override
    public IArticleBuilder publishedIn(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.article.setPublicationDate(calendar.getTime());
        return this;
    }

    @Override
    public IArticleBuilder text(String text) {
        this.article.setText(text);
        return this;
    }

    @Override
    public IArticle get() {
        return this.article;
    }
}
