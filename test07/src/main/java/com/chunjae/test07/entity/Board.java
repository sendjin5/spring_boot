package com.chunjae.test07.entity;

import lombok.Data;

@Data
public class Board {
    private int no;
    private String title;
    private String content;
    private String author;
    private String file;
    private String resdate;
}
