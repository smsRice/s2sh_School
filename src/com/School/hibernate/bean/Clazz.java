package com.School.hibernate.bean;


import java.io.Serializable;
import java.util.Set;

/**
 * Created by root on 16-12-14.
 */
public class Clazz implements Serializable {
    private Long cid;

    private String classDesc;

    private int clazzNo;
    private Grade grade;

    private Set<Student> students;
    private Set<Teacher> teachers;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getClazzNo() {
        return clazzNo;
    }

    public void setClazzNo(int clazzNo) {
        this.clazzNo = clazzNo;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
