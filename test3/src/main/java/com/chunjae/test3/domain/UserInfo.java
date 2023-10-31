package com.chunjae.test3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
            int no;
            String id;
            String pw;
            String name;
            String email;
            String tel;
            String regdate;
            int point;
            int act;
            int lev;
}


