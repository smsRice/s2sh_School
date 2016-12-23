package com.school.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s on 2016/12/21.
 */
public class SpringUtils {
    public static ApplicationContext applicationContext;

    static {
        applicationContext = new ClassPathXmlApplicationContext("springConfig/application.xml");
    }
}
