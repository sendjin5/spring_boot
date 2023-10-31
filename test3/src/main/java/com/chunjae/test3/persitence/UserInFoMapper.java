package com.chunjae.test3.persitence;

import com.chunjae.test3.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInFoMapper {

    public List<UserInfo> userList();
    public UserInfo userGet(String id);
    public void userInsert(UserInfo userInfo);
    public int idcheck(String id);
}
