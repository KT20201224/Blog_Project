package me.kyoungtae.Blog.dto;

import me.kyoungtae.Blog.domain.Article;

import java.time.LocalDateTime;

public class ArticleViewResponse {

    private Long id;
    private String titile;
    private String content;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article){
        this.id = article.getId();
        this.titile = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }
}
