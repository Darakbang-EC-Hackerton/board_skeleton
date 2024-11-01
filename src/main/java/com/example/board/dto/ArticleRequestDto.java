package com.example.board.dto;

import com.example.board.entity.Article;

//롬복을 통한 코드 리팩토링

public class ArticleRequestDto {
    private Long id;
    private String title;
    private String content;
    public Article toEntity() {
        return new Article(id, title, content);
    }

    //AllArgsConstructor
    public ArticleRequestDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    //NoArgsConstructor
    public ArticleRequestDto() {
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
