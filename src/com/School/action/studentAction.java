package com.School.action;

import com.School.hibernate.bean.Student;
import com.School.spring.service.StudentService;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.aspectj.lang.ProceedingJoinPoint;

import java.io.IOException;
import java.util.List;

/**
 * Created by s on 2016/12/21.
 */
public class studentAction extends ActionSupport implements ModelDriven<Student>{
    private StudentService studentService;
    private Student student;
    private long classId;

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student getModel() {
        return student;
    }

    public String saveStudent() {
        studentService.saveStudent(student,classId);
        return SUCCESS;
    }

    public String deleteStudent() {
        studentService.deleteStudent(student,classId);
        return null;
    }

    public String findAll() throws IOException {
        List list = studentService.findAll();
        ServletActionContext.getResponse().getWriter().print(JSON.toJSONString(list));
        return null;
    }
}
