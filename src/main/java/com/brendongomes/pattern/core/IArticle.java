package com.brendongomes.pattern.core;

import java.util.Date;
import java.util.List;

public interface IArticle {
    void setAuthor(String author);
    void setTitle(String title);
    void setTags(List<String> tags);
    void setPages(int pages);
    void setPublicationDate(Date date);
    void setText(String text);

    String getAuthor();
    String getTitle();
    List<String> getTags();
    int getPages();
    Date getPublicationDate();
    String getText();

    String toString();
}
