package com.chunjae.test07.biz;

import com.chunjae.test07.entity.Role;
import com.chunjae.test07.entity.User;
import com.chunjae.test07.entity.UserRole;
import com.chunjae.test07.per.RoleMapper;
import com.chunjae.test07.per.UserMapper;
import com.chunjae.test07.per.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findUserByLoginId(String loginId){
        return userMapper.findUserByLoginId(loginId);
    }

    public void saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        userMapper.getUserInfo(user);
        Role role = roleMapper.getRoleInfo("ADMIN");
        UserRole userRole = new UserRole();
        userRole.setUser_id(role.getId());
        userRole.setRole_id(role.getId());
        userRoleMapper.setUserRoleInfo(userRole);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
