package com.north.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gaokun on 2016/12/31.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Action action = (Action)ctx.getBean("person");
        System.out.println(action.getClass().getName());
        action.eat("苹果");
    }
}
