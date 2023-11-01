package com.chunjae.test03.biz;

import com.chunjae.test03.entity.Euser;
import com.chunjae.test03.persitence.EuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private EuserMapper euserMapper;

    @Override
    public List<Euser> euserList() {
        return euserMapper.euserList();
    }

    @Override
    public Euser euserGet(String name) {
        return euserMapper.euserGet(name);
    }

    @Override
    public void euserInsert(Euser euser) {
        euserMapper.euserInsert(euser);
    }

    @Override
    public void euserWith(String name) {
        euserMapper.euserWith(name);
    }

    @Override
    public void euserActivate(String name) {
        euserMapper.euserActivate(name);

    }

    @Override
    public void euserDormant(String name) {
        euserMapper.euserDormant(name);
    }

    @Override
    public Euser euserEmail(String email) {
        return euserMapper.euserEmail(email);
    }

    @Override
    public Euser euserId(String name) {
        return euserMapper.euserId(name);
    }

    @Override
    public Euser findById(Euser euser) {
        return euserMapper.findById(euser);
    }

    @Override
    public Euser findByPw(Euser euser) {
        return euserMapper.findByPw(euser);
    }
}
