package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Entity //DB가 해당 객체를 인식가능!
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class Article {
    @Id //대표값을 지정! Like a 주민번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 id를 자동 생성
    private Long id;

    @Column
    private String title;
    @Column
    private String content;

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
