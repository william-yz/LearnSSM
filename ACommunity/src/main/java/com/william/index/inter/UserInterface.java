package com.william.index.inter;

import com.william.index.pojo.User;

public interface UserInterface {
    User getUser(int id);
    User getUserByUserId(String useId);
    void addUser(String name);
}
