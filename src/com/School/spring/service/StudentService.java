package com.School.spring.service;

import com.School.hibernate.bean.Student;

import java.io.Serializable;
import java.util.List;

/**
 * Created by s on 2016/12/19.
 */
public interface StudentService {
    void saveStudent(Student student,Serializable classId);

    void deleteStudent(Student student,Serializable classId);

    void updateStudent(Student student,Serializable classId);

    List findAll();
}
