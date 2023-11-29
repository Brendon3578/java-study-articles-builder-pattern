package com.brendongomes.pattern;

import com.brendongomes.pattern.builder.BlogBuilder;
import com.brendongomes.pattern.builder.MagazineBuilder;
import com.brendongomes.pattern.builder.NewspaperBuilder;
import com.brendongomes.pattern.core.IArticle;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int todayDay = today.get(Calendar.DATE);
        int todayMonth = today.get(Calendar.MONTH);
        int todayYear = today.get(Calendar.YEAR);

        IArticle myBlog = BlogBuilder.builder()
                .author("Brendon Gomes")
                .title("Programando Java com Builder Pattern")
                .tags("java", "builder pattern", "boas práticas")
                .publishedIn(28, 10, 2023)
                .text("Programar com orientação a objetos...")
                .get();


        System.out.println(myBlog.toString());
        System.out.println("O blog do " + myBlog.getAuthor() + " foi publicado em " + myBlog.getPublicationDate());

        IArticle todayNewspaper = NewspaperBuilder.builder()
                .author("Brendon Gomes")
                .title("Java nos dias atuais, vale a pena? Com certeza")
                .tags("java", "tecnologia", "vagas")
                .publishedIn(todayDay, todayMonth, todayYear)
                .text("Desde que java foi desenvolvida em 1995...")
                .totalPages(7)
                .get();

        System.out.println(todayNewspaper.toString());

        IArticle myMagazine = MagazineBuilder.builder()
                .author("Brendon Gomes")
                .title("Revista Java Magazine")
                .tags("java")
                .publishedIn(8, 7, 2023)
                .text("Java e Kotlin, ambas são...")
                .totalPages(3)
                .get();

        System.out.println(myMagazine.toString());
    }
}