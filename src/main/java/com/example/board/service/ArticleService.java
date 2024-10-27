package com.example.board.service;

import com.example.board.dto.ArticleDto;
import com.example.board.entity.Article;
import com.example.board.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //서비스 객체를 스프링부트에 생성
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    //리스트 형태의 Article 엔티티들을 반환해주는 메서드
    public List<Article> findAll() {

    }

    //id값을 바탕으로 레파지토리에서 원하는 Article을 반환해주는 메서드
    public Article findById(Long id) {

    }

    //새 게시글을 생성해주는 메서드
    public Article create(ArticleDto dto) {

    }

    //게시글을 업데이트해주는 메서드
    public Article update(Long id, ArticleDto dto) {

    }

    //게시글을 삭제해주는 메서드
    public Article delete(Long id) {

    }

}
