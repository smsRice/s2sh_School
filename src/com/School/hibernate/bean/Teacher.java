package com.School.hibernate.bean;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by root on 16-12-15.
 */
public class Teacher implements Serializable{
    private Long tid;

    private String name;
    private int age;
    private String teacherDesc;

    private Set<Clazz> clazzs;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeacherDesc() {
        return teacherDesc;
    }

    public void setTeacherDesc(String teacherDesc) {
        this.teacherDesc = teacherDesc;
    }

    public Set<Clazz> getClazzs() {
        return clazzs;
    }

    public void setClazzs(Set<Clazz> clazzs) {
        this.clazzs = clazzs;
    }
}
