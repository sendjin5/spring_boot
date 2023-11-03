package com.chunjae.test07.per;

import com.chunjae.test07.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    Role getUserInfo(@Param("user") String user);
}
