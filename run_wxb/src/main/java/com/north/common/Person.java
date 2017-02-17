package com.north.common;

import org.springframework.stereotype.Component;

/**
 * Created by gaokun on 2016/12/31.
 */
@Component("person")
public class Person implements Action {

    public void eat(String string) {
        System.out.println("人在吃"+string+"呢！");
    }
}
