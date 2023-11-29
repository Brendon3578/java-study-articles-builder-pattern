package com.brendongomes.pattern;

import com.brendongomes.pattern.core.IArticle;

import java.util.Date;
import java.util.List;

public class Newspaper implements IArticle {
    private String author;
    private String title;
    private List<String> tags;
    private int pages;
    private Date publicationDate;
    private String text;

    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                ", pages=" + pages +
                ", publicationDate=" + publicationDate +
                ", text='" + text + '\'' +
                '}';
    }
}
