package com.bw.entity;

/**
 * Created by hasee on 2019/7/30.
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Integer rid;

    public User(Integer id, String name, String pwd, Integer rid) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.rid = rid;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", rid=" + rid +
                '}';
    }
}
