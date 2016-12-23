package com.school.test;

import com.School.hibernate.bean.Student;
import com.School.spring.service.StudentService;
import com.opensymphony.xwork2.config.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s on 2016/12/19.
 */
public class testSpring {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student) applicationContext.getBean("student2");
        System.out.println(student.getStudentDesc());
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
    }
    @Test
    public void test3() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.configure("/hibernateConfig/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
    }

}
