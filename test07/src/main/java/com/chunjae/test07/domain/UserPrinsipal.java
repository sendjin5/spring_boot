package com.chunjae.test07.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.chunjae.test07.entity.User;

import java.util.Arrays;
import java.util.Collection;
//스프링 시큐리티에서 기본적으로 제공하는 인터페이스(UserDetails)
@Data
public class UserPrinsipal implements UserDetails {


    private User user;

    public UserPrinsipal (User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new UserGrant());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired(){   //계정이 없냐고 물어봄
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getActive() == 1;
    }

    public String getId(){
        return user.getLoginId();
    }

    public String getName(){
        return user.getUserName();
    }
}