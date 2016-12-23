package com.school.test;

import org.junit.jupiter.api.Test;

/**
 * Created by s on 2016/12/21.
 */
public class sessionFactoryTest extends SpringUtils{
    @Test
    public void testSessionFactory() {
        applicationContext.getBean("sessionFactory");
    }
}
