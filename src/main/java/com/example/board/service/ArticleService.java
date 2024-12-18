package com.example.board.service;

import com.example.board.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //서비스 객체를 스프링부트에 생성
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    //리스트 형태의 Article 엔티티들을 반환해주는 메서드


    //id값을 바탕으로 레파지토리에서 원하는 Article을 반환해주는 메서드


    //새 게시글을 생성해주는 메서드


    //게시글을 업데이트해주는 메서드


    //게시글을 삭제해주는 메서드


}
