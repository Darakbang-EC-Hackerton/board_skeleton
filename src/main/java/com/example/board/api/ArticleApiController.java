package com.example.board.api;

import com.example.board.dto.ArticleResponseDto;
import com.example.board.service.ArticleService;
import com.example.board.dto.ArticleRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/articles")
@RestController
public class ArticleApiController {
    @Autowired //서비스 객체를 가져와 의존성 주입
    private ArticleService articleService;

    //GET
    @GetMapping
    public List<ArticleResponseDto> getAllArticles() {
        //articleService에서 구현한 메서드를 호출하여 모든 게시글을 조회 후 반환하는 코드

    }

    @GetMapping("/{id}")
    public ArticleResponseDto getArticleById(@PathVariable Long id) {
        //articleService에서 구현한 메서드를 호출하여 게시글 단건 조회 후 반환하는 코드

    }

    //POST
    @PostMapping
    public ResponseEntity<ArticleResponseDto> createArticle(@RequestBody ArticleRequestDto articleRequestDto) {
        //기본 요구 사항: articleService에 POST로 받은 dto를 전달하여 새로운 게시글을 생성하고 그 결과를 반환
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<ArticleResponseDto> updateArticle(@PathVariable Long id,
                                          @RequestBody ArticleRequestDto articleRequestDto) {
        //기본 요구 사항: articleService에 PATCH로 받은 id, dto를 전달하여 수정하고 그 결과를 반환
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<ArticleResponseDto> deleteArticleById(@PathVariable Long id) {
        //기본 요구 사항: articleService에 DELETD로 받은 id를 전달하여 해당 게시물을 삭제하고 그 결과를 반환
    }

    //추가 구현 사항: 제목으로 게시글 찾기
    //@GetMapping("/{title}")


    //추가 구현 사항: 내용으로 게시글 찾기
    //@GetMapping("/{content}")

    // 추가 구현 사항: HTTP 응답을 참고하여 적절한 오류 메시지를 응답으로 반환


}


