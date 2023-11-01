package com.chunjae.test03.persitence;

import com.chunjae.test03.entity.Euser;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EuserMapper {
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
