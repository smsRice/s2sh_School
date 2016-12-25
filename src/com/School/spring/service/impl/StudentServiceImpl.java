package com.School.spring.service.impl;

import com.School.hibernate.bean.Student;
import com.School.spring.dao.StudentDao;
import com.School.spring.service.StudentService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by s on 2016/12/19.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(Student student,Serializable classId) {
        this.studentDao.saveStudent(student ,classId);
    }

    @Override
    public void deleteStudent(Student student,Serializable classId) {
        this.studentDao.deleteStudent(student,classId);
    }

    @Override
    public void updateStudent(Student student,Serializable classId) {
        this.studentDao.updateStudent(student,classId);
    }

    @Override
    public List findAll() {
        return this.studentDao.findAll();
    }

}
