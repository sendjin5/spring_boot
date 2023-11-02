package com.chunjae.test05.biz;


import com.chunjae.test05.entity.Euser;

import java.util.List;

public interface UserService {
    public List<Euser> euserList();
    public Euser euserGet(String name);
    public void euserInsert(Euser euser);
    public void euserWith(String name);
    public void euserActivate(String name);
    public void euserDormant(String name);
    public Euser euserEmail(String email);
    public Euser euserId(String name);
    public Euser findById(Euser euser);
    public Euser findByPw(Euser euser);
}
