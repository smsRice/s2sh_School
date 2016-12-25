package com.School.spring.dao;

import com.School.hibernate.bean.Student;

import java.io.Serializable;
import java.util.List;

/**
 * Created by s on 2016/12/19.
 */
public interface StudentDao {
    void saveStudent(Student student ,Serializable classId);

    void deleteStudent(Student student,Serializable classId);

    void updateStudent(Student student,Serializable classId);

    List findAll();
}
