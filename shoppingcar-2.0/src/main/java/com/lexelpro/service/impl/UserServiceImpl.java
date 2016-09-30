package com.lexelpro.service.impl;
import com.lexelpro.dao.javabeanDAo;
import com.lexelpro.dao.UserDAO;
import com.lexelpro.entity.User;
import com.lexelpro.entity.javabean;
import com.lexelpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Lexel PRO
 * @version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}
	
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private javabeanDAo javabeanDAo;

    @Override
    public long createUser(User user) {
        return userDAO.createUser(user);
    }
    @Override
    public User updateUser(User user) {return userDAO.updateUser(user);}
    @Override
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }

    @Override
    public List<javabean> getbyID(String id) {
        return javabeanDAo.getbyID(id);
    }

    @Override
    public List<javabean> getAllUsers() {
        return javabeanDAo.bean();
    }

    @Override
    public javabean getUser(int id) {
        return javabeanDAo.idbean(id);
    }
}
