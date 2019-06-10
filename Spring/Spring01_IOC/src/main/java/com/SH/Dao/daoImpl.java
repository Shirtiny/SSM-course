package com.SH.Dao;

import com.SH.Bean.Users;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class daoImpl implements Idao{

    public boolean addUsers(Users user){
        if (user==null){
        return false;
        }else {
            return true;
        }
    }
    public boolean queryUsers(int id){
        if (id>=0){
            return true;
        }else {
            return false;
        }
    }
}
