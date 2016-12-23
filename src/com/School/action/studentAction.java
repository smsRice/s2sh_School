package com.School.action;

import com.School.hibernate.bean.Student;
import com.School.spring.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by s on 2016/12/21.
 */
public class studentAction extends ActionSupport {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public String saveStudent() {
        System.out.println(studentService);
        Student student = new Student();
        student.setStudentDesc("费劲");
        System.out.println(studentService);
        studentService.saveStudent(student);
        return SUCCESS;
    }

    public String test() {
        int a = 1 / 0;
        System.out.println(190);
        return ERROR;
    }
}
