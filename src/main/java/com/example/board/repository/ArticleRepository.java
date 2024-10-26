package com.example.board.repository;

import com.example.board.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    //ArrayList<Articles>로 받기 위해 오버라이딩하기
    @Override
    ArrayList<Article> findAll();
}
