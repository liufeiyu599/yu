package com.bw.controller;

import com.bw.entity.Result;
import com.bw.entity.Student;
import com.bw.entity.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by hasee on 2019/7/30.
 */
@RestController
public class UserController {
    @Autowired
    UserService UserService;
    @Autowired
    HttpServletRequest request;
    @RequestMapping("login")
    public Result login(@RequestBody User user){
        user=UserService.login(user);
        System.out.println(user);
        if(user==null){
            return new Result(false,"登录失败");
        }else{
            request.getSession().setAttribute("sid",user.getId());
        }
        return new Result(true,"登陆成功");
    }
    @RequestMapping("list")
    public List<Student> list(){
        List<Student> list=UserService.findAll();
        System.out.println(list);

        return list;
    }
    @RequestMapping("delete")
    public int delete(Integer sid){
       // UserService.delete(sid);
        return 0;
    }
}
