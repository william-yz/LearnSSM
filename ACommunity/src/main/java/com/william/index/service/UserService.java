package com.william.index.service;

import com.william.index.dao.UserDao;
import com.william.index.pojo.User;
import com.william.common.dao.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by YANGWI on 5/11/2016.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private CommonDao commonDao;
    @Transactional
    public User getUserById(String id) {
        return userDao.get(Integer.valueOf(id));
    }

    public User getUserByUserId(String userId) {
        return userDao.getByUserId(userId);
    }
}
