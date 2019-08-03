package com.bw.entity;

/**
 * Created by hasee on 2019/7/31.
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private Integer cj;

    public Student(Integer sid, String sname, Integer age, Integer cj) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.cj = cj;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCj() {
        return cj;
    }

    public void setCj(Integer cj) {
        this.cj = cj;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", cj=" + cj +
                '}';
    }

    public Student() {
    }
}
