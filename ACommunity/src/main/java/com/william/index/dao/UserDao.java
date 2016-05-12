package com.william.index.dao;

import com.william.index.inter.UserInterface;
import com.william.index.pojo.User;
import com.william.common.dao.CommonDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao extends CommonDao<UserInterface> {

    @Override
    protected Class<UserInterface> getInterfaceClass() {
        return UserInterface.class;
    }

    public User get(Integer id) {
        return getEntityInterface().getUser(id);
    }

    public User getByUserId(String userId) {
        return getEntityInterface().getUserByUserId(userId);
    }


}
