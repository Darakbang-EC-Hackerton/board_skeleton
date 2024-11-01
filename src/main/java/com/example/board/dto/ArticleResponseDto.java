package com.example.board.dto;

public class ArticleResponseDto {
    private String title;
    private String content;

    //Constructor
    public ArticleResponseDto(String title, String content) {
        this.title = title;
        this.content = content;
    }


    //Getters
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
