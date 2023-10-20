package com.myapp.devshop.user.service.impl;

import com.myapp.devshop.user.dao.UserDao;
import com.myapp.devshop.user.service.face.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired UserDao userDao;

    @Override
    public String dataSelect() {
        return userDao.testSelect();

    }
}
