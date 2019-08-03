package com.bw.mapper;

import com.bw.entity.Student;
import com.bw.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2019/7/30.
 */
@Mapper
public interface UserMapper {
    User login(User user);

    List<Student> findAll();
}
