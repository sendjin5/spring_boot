package com.chunjae.test3.service;

import com.chunjae.test3.domain.UserInfo;
import com.chunjae.test3.persitence.UserInFoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInFoImpl implements UserInFoService{

    @Autowired
    private UserInFoMapper userInFoMapper;

    @Autowired
    private BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();


    @Override
    public List<UserInfo> userList() {
        return userInFoMapper.userList();
    }

    @Override
    public UserInfo userGet(String id) {
        return userInFoMapper.userGet(id);
    }

    @Override
    public void userInsert(UserInfo userInfo) {
        userInFoMapper.userInsert(userInfo);

    }

    @Override
    public boolean userLogin(String id, String pw) {
        boolean pass = false;
        UserInfo userinfo = userInFoMapper.userGet(id);
        if(userinfo != null){
            pass = pwEncoder.matches(pw, userinfo.getPw());
        }
        return pass;
    }

    @Override
    public boolean idcheck(String id) {
        boolean pass = true;
        int cnt = userInFoMapper.idcheck(id);
        if(cnt > 0) pass = false;
        return pass;

    }
}
