package com.example.board.dto;

import com.example.board.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//롬복을 통한 코드 리팩토링
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString()
public class ArticleDto {
    private Long id;
    private String title;
    private String content;
    public Article toEntity() {
        return new Article(id, title, content);
    }
}
