package com.north.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by gaokun on 2016/12/31.
 */
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Before(value = "execution(* com.north.common.Person.*(..))")
    void beforeExec(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringType());
        System.out.println("执行方法前干点啥呢！");
    }
}
