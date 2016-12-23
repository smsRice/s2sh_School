package com.School.spring.dao.impl;

import com.School.hibernate.bean.Student;
import com.School.spring.dao.StudentDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by s on 2016/12/22.
 */
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

    @Override
    public void saveStudent(Student student) {
        this.getHibernateTemplate().execute(new HibernateCallback<Student>() {
            @Override
            public Student doInHibernate(Session session) throws HibernateException {
                return null;
            }
        });
        this.getHibernateTemplate().save(student);

    }
}
