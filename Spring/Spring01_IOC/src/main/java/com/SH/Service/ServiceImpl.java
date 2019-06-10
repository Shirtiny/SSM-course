package com.SH.Service;

import com.SH.Bean.Users;
import com.SH.Dao.Idao;
import com.SH.Dao.daoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public class ServiceImpl implements Iservice{
    Idao dao;
    public void setDao(Idao dao) {
        this.dao = dao;
    }


@Transactional
    public boolean QueryAndaddUsers(int id, Users user) {
        if (dao.queryUsers(id)==false){
            return false;
        }else {
            return true;
        }
    }
}
