package com.SH.Dao;

import com.SH.Bean.Users;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface Idao {

    public boolean addUsers(Users user);

    public boolean queryUsers(int id);

}
