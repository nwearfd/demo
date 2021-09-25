package com.example.demo.database.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private long idx;
    private String name;
    private String content;
    private String writer;
    private String b_date;
}
