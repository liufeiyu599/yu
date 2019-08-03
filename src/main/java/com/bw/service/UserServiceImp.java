package com.bw.service;

import com.bw.entity.Student;
import com.bw.entity.User;
import com.bw.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2019/7/30.
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserMapper UserMapper;


    @Override
    public User login(User user) {
        return this.UserMapper.login(user);
    }

    @Override
    public List<Student> findAll() {
        return this.UserMapper.findAll();
    }
}
