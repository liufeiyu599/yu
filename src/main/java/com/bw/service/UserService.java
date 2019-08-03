package com.bw.service;

import com.bw.entity.Student;
import com.bw.entity.User;

import java.util.List;

/**
 * Created by hasee on 2019/7/30.
 */
public interface UserService {
    User login(User user);

    List<Student> findAll();
}
