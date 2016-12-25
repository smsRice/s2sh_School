package com.school.test;

import com.School.hibernate.bean.Student;
import com.School.spring.service.StudentService;
import org.junit.jupiter.api.Test;

/**
 * Created by s on 2016/12/21.
 */
public class studentTest extends SpringUtils {
    /*
    *   测试service和daoceng在spring中
    * */
    @Test
    public void testStudent() {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setStudentDesc("留人");
//        studentService.saveStudent(student);
    }
    /*
    *   测试action在spring中产生
    * */
    @Test
    public void testStudentAction() {
        applicationContext.getBean("studentAction");
    }
}
