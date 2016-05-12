package com.william.common.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonDao<T>{
    @Autowired
    protected SqlSessionTemplate sqlSession;

    protected T entityInterface;

    protected abstract Class<T> getInterfaceClass();

    public T getEntityInterface() {
        if (entityInterface == null) {
            entityInterface = sqlSession.getMapper(getInterfaceClass());
        }
        return entityInterface;
    }
}
