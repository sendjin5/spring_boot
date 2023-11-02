package com.chunjae.test05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Euser {

    private Integer id;
    private String name;
    private String pw;
    private String username;
    private String email;
    private String address;
    private String tel;
    private String regdate;
    private String lev;
    private String act;
}
