package com.School.spring.service.impl;

import com.School.hibernate.bean.Student;
import com.School.spring.dao.StudentDao;
import com.School.spring.service.StudentService;

/**
 * Created by s on 2016/12/19.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(Student student) {
        System.out.println(studentDao);
        this.studentDao.saveStudent(student);
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
