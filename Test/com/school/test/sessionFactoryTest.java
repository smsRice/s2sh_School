package com.school.test;

import com.alibaba.fastjson.JSON;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by s on 2016/12/21.
 */
public class sessionFactoryTest extends SpringUtils {

    /*
    *   测试hql取值问题
    * */
    @Test
    public void testSessionFactory() {
        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List list = session.createQuery("select s.name,s.age,s.score,s.studentId,c.clazzNo,g.gradeId,s.sid,c.cid from Student s,Clazz c,Grade g").list();
        for (Object aList : list) {
            Object[] objects = (Object[]) aList;
            for (int j = 0; j < objects.length; j++) {
                Object o = objects.clone()[j];
                System.out.println(o);
            }
        }
        System.out.println(JSON.toJSONString(list));
    }
}
