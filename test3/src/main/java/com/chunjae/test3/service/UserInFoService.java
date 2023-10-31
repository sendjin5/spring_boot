package com.chunjae.test3.service;

import com.chunjae.test3.domain.UserInfo;

import java.util.List;


public interface UserInFoService {

    public List<UserInfo> userList();
    public UserInfo userGet(String id);
    public void userInsert(UserInfo userInfo);
    public boolean userLogin(String id, String pw);
    public boolean idcheck(String id);

}

