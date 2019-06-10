package com.SH.Service;

import com.SH.Bean.Users;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface Iservice {

    public boolean QueryAndaddUsers(int id, Users user);
}
