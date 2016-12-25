package com.School.spring.dao.impl;

import com.School.hibernate.bean.Clazz;
import com.School.hibernate.bean.Student;
import com.School.spring.dao.StudentDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by s on 2016/12/22.
 */
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

    @Override
    public void saveStudent(Student student,Serializable classId) {
        Clazz clazz = this.getHibernateTemplate().get(Clazz.class, classId);
        student.setClazz(clazz);
        this.getHibernateTemplate().save(student);
    }

    @Override
    public void deleteStudent(Student student,Serializable classId) {
        Student student1 = this.getHibernateTemplate().get(Student.class,student.getSid());
        this.getHibernateTemplate().delete(student);
    }

    @Override
    public void updateStudent(Student student,Serializable classId) {
        this.getHibernateTemplate().update(student);
    }

    @Override
    public List findAll() {
        return this.getHibernateTemplate().execute(new HibernateCallback<List>() {
            @Override
            public List doInHibernate(Session session) throws HibernateException {
                return session.createQuery("select s.name,s.age,s.score,s.studentDesc,s.studentId,c.clazzNo,g.gradeId,s.sid " +
                        "from Student s,Clazz c,Grade g ").list();
            }
        });
    }
}
