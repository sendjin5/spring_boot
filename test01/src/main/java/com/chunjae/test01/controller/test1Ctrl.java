package com.chunjae.test01.controller;


import com.chunjae.test01.domain.Test1;
import com.chunjae.test01.persistence.Test1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class test1Ctrl {

    @Autowired
    private Test1Mapper test1Mapper;


    @GetMapping("/test1/getList1.do")
    @ResponseBody
    public List<Test1> gettestList1() {
        return test1Mapper.getList1();
    }

    @GetMapping("/test1/getList2.do")
    @ResponseBody
    public List<Test1> gettestList2() {
        return test1Mapper.getList2();
    }
}
