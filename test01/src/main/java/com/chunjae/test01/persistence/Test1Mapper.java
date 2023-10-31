package com.chunjae.test01.persistence;

import com.chunjae.test01.domain.Test1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Test1Mapper {
    @Select("select * from test1")
    public List<Test1> getList1();

    List<Test1> getList2();

}
